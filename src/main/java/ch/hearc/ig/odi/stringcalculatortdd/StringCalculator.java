package ch.hearc.ig.odi.stringcalculatortdd;

import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringCalculator {

    private static final Logger logger= LogManager.getLogger(StringCalculator.class);

    public StringCalculator() {
    }

    public int add(final String numbers) {
        //default delimiter
        String delimiter = ",|\n";
        String numbersUpdated = numbers;

        //if it begins by '//' then it's a personalize delimiter(s)
        if (numbers.startsWith("//")) {
            logger.info("Start with //");

            delimiter = this.extractDelimiter(numbers);
            //"cut" the beginning of the string so that the personalize delimiter is removed
            numbersUpdated = numbers.substring(numbers.indexOf("\n") + 1);
        }
        return add(numbersUpdated, delimiter);
    }

    private int add(final String numbersWithoutDelimiter, final String delimiter) {
        int returnValue = 0;
        List<Integer> negativeNumbers = new ArrayList();

        //a string tab containing the numbers without the delimiter(s) is created
        String[] numbersArray = numbersWithoutDelimiter.split(delimiter);

        for (String number : numbersArray) {
            //test if the numbers array is not empty
            if (!(number.trim().length() == 0)) {
                Integer numberInt = Integer.parseInt(number);
                if (numberInt < 0)
                    negativeNumbers.add(numberInt);
                else if (numberInt <= 1000)
                    returnValue += numberInt;
                else {
                    logger.warn("Warning number > 1000");
                }
            }
        }

        if (negativeNumbers.size() > 0) {
            logger.fatal("no-negatives number pls");
            throw new RuntimeException("Negative not allowed: " + negativeNumbers.toString());
        }

        return returnValue;
    }

    private String extractDelimiter(String numbers) {
        String[] delimiters;
        String returnDelimiter;
        int beginDelimiterIndex = numbers.indexOf("//") + 2;
        int endDelimiterIndex = numbers.indexOf("\n");
        //if it begin with '[' and end by ']' there are multiple delimiters
        if(numbers.charAt(beginDelimiterIndex) == '[' && numbers.charAt(endDelimiterIndex - 1) == ']') {
            //use an Apache library to get each delimiters between '[' and ']'
            delimiters = StringUtils.substringsBetween(numbers.substring(beginDelimiterIndex, endDelimiterIndex), "[", "]");
            returnDelimiter = "";
            //iterate through the delimiters list and concatenate the delimiter with a '|' between
            //them so that the split method is OK with the regex
            for (String element: delimiters) {
                returnDelimiter += element;
                returnDelimiter += "|";
            }
            returnDelimiter = StringUtils.removeEnd(returnDelimiter, "|");
        } else {
            //there is only one delimiter
            returnDelimiter = numbers.substring(beginDelimiterIndex, endDelimiterIndex);
        }

        return returnDelimiter;
    }
}
