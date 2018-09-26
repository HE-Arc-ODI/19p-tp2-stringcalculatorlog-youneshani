package ch.hearc.ig.odi.stringcalculatortdd;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringCalculator {

    public StringCalculator() {
    }

    // Requirement 1.1 (string empty)
//    public final int add(final String numbers) {
//        String[] numbersArray = numbers.split(",");
//        if (numbersArray.length > 2) {
//            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
//        } else {
//            for (String number : numbersArray) {
//                if(!(number.length() == 0)){
//                    Integer.parseInt(number); // If it is not a number, parseInt will throw an exception
//                }
//            }
//        }
//        return 0;
//    }

    //Requirement 1.2 - 1.3 (1 or 2 numbers)
//    public final int add(final String numbers) {
//        int returnValue = 0;
//        String[] numbersArray = numbers.split(",");
//        if (numbersArray.length > 2) {
//            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
//        }
//        for (String number : numbersArray) {
//            if (!(number.trim().length() == 0)) { // After refactoring
//                returnValue += Integer.parseInt(number);
//            }
//        }
//        return returnValue;
//    }

    //Requirement 2
//    public final int add(final String numbers) {
//        int returnValue = 0;
//        String[] numbersArray = numbers.split(",");
//
//        for (String number : numbersArray) {
//            if (!(number.trim().length() == 0)) { // After refactoring
//                returnValue += Integer.parseInt(number);
//            }
//        }
//        return returnValue;
//    }

    //Requirement 3
//    public final int add(final String numbers) {
//        int returnValue = 0;
//        String[] numbersArray = numbers.split(",|\n");
//
//        for (String number : numbersArray) {
//            if (!(number.trim().length() == 0)) { // After refactoring
//                returnValue += Integer.parseInt(number);
//            }
//        }
//        return returnValue;
//    }

    //Requirement 4
//    public int add(final String numbers) {
//        String delimiter = ",|\n";
//        String numbersUpdated = numbers;
//        if (numbers.startsWith("//")) {
//            int delimiterIndex = numbers.indexOf("//") + 2;
//            delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
//            numbersUpdated = numbers.substring(numbers.indexOf("\n") + 1);
//        }
//        return add(numbersUpdated, delimiter);
//    }
//
//    private int add(final String numbers, final String delimiter) {
//        int returnValue = 0;
//        String[] numbersArray = numbers.split(delimiter);
//        for (String number : numbersArray) {
//            if (!(number.trim().length() == 0)) {
//                returnValue += Integer.parseInt(number.trim());
//            }
//        }
//        return returnValue;
//    }

    //Requirement 5
//    public int add(final String numbers) {
//        String delimiter = ",|\n";
//        String numbersUpdated = numbers;
//        if (numbers.startsWith("//")) {
//            int delimiterIndex = numbers.indexOf("//") + 2;
//            delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
//            numbersUpdated = numbers.substring(numbers.indexOf("\n") + 1);
//        }
//        return add(numbersUpdated, delimiter);
//    }
//
//    private int add(final String numbers, final String delimiter) {
//        int returnValue = 0;
//        List<Integer> negativeNumbers = new ArrayList();
//        String[] numbersArray = numbers.split(delimiter);
//        for (String number : numbersArray) {
//            if (!(number.trim().length() == 0)) {
//                Integer numberInt = Integer.parseInt(number);
//                if (numberInt < 0)
//                    negativeNumbers.add(numberInt);
//
//                returnValue += Integer.parseInt(number.trim());
//            }
//        }
//
//        if (negativeNumbers.size() > 0) {
//            throw new RuntimeException("Negative not allowed: " + negativeNumbers.toString());
//        }
//
//        return returnValue;
//    }

    //Requirement 6
//    public int add(final String numbers) {
//        String delimiter = ",|\n";
//        String numbersUpdated = numbers;
//        if (numbers.startsWith("//")) {
//            int delimiterIndex = numbers.indexOf("//") + 2;
//            delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
//            numbersUpdated = numbers.substring(numbers.indexOf("\n") + 1);
//        }
//        return add(numbersUpdated, delimiter);
//    }
//
//    private int add(final String numbers, final String delimiter) {
//        int returnValue = 0;
//        List<Integer> negativeNumbers = new ArrayList();
//        String[] numbersArray = numbers.split(delimiter);
//        for (String number : numbersArray) {
//            if (!(number.trim().length() == 0)) {
//                Integer numberInt = Integer.parseInt(number);
//                if (numberInt < 0)
//                    negativeNumbers.add(numberInt);
//                else if (numberInt <= 1000)
//                    returnValue += Integer.parseInt(number.trim());
//            }
//        }
//
//        if (negativeNumbers.size() > 0) {
//            throw new RuntimeException("Negative not allowed: " + negativeNumbers.toString());
//        }
//
//        return returnValue;
//    }

    //Requirement 7
//    public int add(final String numbers) {
//        String delimiter = ",|\n";
//        String numbersUpdated = numbers;
//
//        if (numbers.startsWith("//")) {
//            int beginDelimiterIndex = numbers.indexOf("//") + 2;
//            int endDelimiterIndex = numbers.indexOf("\n");
//            if(numbers.charAt(beginDelimiterIndex) == '[' && numbers.charAt(endDelimiterIndex - 1) == ']') {
//                beginDelimiterIndex += 1;
//                endDelimiterIndex -= 1;
//            }
//            delimiter = numbers.substring(beginDelimiterIndex, endDelimiterIndex);
//
//            numbersUpdated = numbers.substring(numbers.indexOf("\n") + 1);
//        }
//        return add(numbersUpdated, delimiter);
//    }
//
//    private int add(final String numbers, final String delimiter) {
//        int returnValue = 0;
//        List<Integer> negativeNumbers = new ArrayList();
//        String[] numbersArray = numbers.split(delimiter);
//        for (String number : numbersArray) {
//            if (!(number.trim().length() == 0)) {
//                Integer numberInt = Integer.parseInt(number);
//                if (numberInt < 0)
//                    negativeNumbers.add(numberInt);
//                else if (numberInt <= 1000)
//                    returnValue += Integer.parseInt(number.trim());
//            }
//        }
//
//        if (negativeNumbers.size() > 0) {
//            throw new RuntimeException("Negative not allowed: " + negativeNumbers.toString());
//        }
//
//        return returnValue;
//    }

    //Requirement 8 - 9
    public int add(final String numbers) {
        //default delimiter
        String delimiter = ",|\n";
        String numbersUpdated = numbers;
        String[] delimiters;

        //if it begin by '//' then it's a personalize delimiter(s)
        if (numbers.startsWith("//")) {
            int beginDelimiterIndex = numbers.indexOf("//") + 2;
            int endDelimiterIndex = numbers.indexOf("\n");
            //if it begin with '[' and end by ']' there are multiple delimiters
            if(numbers.charAt(beginDelimiterIndex) == '[' && numbers.charAt(endDelimiterIndex - 1) == ']') {
                //use an Apache library to get each delimiters between '[' and ']'
                delimiters = StringUtils.substringsBetween(numbers.substring(beginDelimiterIndex, endDelimiterIndex), "[", "]");
                delimiter = "";
                //iterate through the delimiters list and concatenate the delimiter with a '|' between
                //them so that the split method will be OK with the regex
                for (String element: delimiters) {
                    delimiter += element;
                    delimiter += "|";
                }
                delimiter = StringUtils.removeEnd(delimiter, "|");
            } else {
                //there is only one delimiter
                delimiter = numbers.substring(beginDelimiterIndex, endDelimiterIndex);
            }

            //"cut" the beginning of the string so that the personalize delimiter is removed
            numbersUpdated = numbers.substring(numbers.indexOf("\n") + 1);
        }
        return add(numbersUpdated, delimiter);
    }

    private int add(final String numbers, final String delimiter) {
        int returnValue = 0;
        List<Integer> negativeNumbers = new ArrayList();

        //a string tab containing the numbers without the delimiter(s) is created
        String[] numbersArray = numbers.split(delimiter);

        for (String number : numbersArray) {
            if (!(number.trim().length() == 0)) {
                Integer numberInt = Integer.parseInt(number);
                if (numberInt < 0)
                    negativeNumbers.add(numberInt);
                else if (numberInt <= 1000)
                    returnValue += Integer.parseInt(number.trim());
            }
        }

        if (negativeNumbers.size() > 0) {
            throw new RuntimeException("Negative not allowed: " + negativeNumbers.toString());
        }

        return returnValue;
    }
}
