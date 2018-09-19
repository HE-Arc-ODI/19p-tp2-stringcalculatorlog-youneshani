package ch.hearc.ig.odi.stringcalculatortdd.console;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    // Requirement 1
//    public static final void add(final String numbers) {
//        String[] numbersArray = numbers.split(",");
//        if (numbersArray.length > 2) {
//            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
//        } else {
//            for (String number : numbersArray) {
//                Integer.parseInt(number); // If it is not a number, parseInt will throw an exception
//            }
//        }
//    }

    // Requirement 2 (string empty)
//    public static final int add(final String numbers) {
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

    //Requirement 3
//    public static final int add(final String numbers) {
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

    //Requirement 4
//    public static final int add(final String numbers) {
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

    //Requirement 5
//    public static final int add(final String numbers) {
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

    //Requirement 6
//    public static int add(final String numbers) {
//        String delimiter = ",|\n";
//        String numbersWithoutDelimiter = numbers;
//        if (numbers.startsWith("//")) {
//            int delimiterIndex = numbers.indexOf("//") + 2;
//            delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
//            numbersWithoutDelimiter = numbers.substring(numbers.indexOf("\n") + 1);
//        }
//        return add(numbersWithoutDelimiter, delimiter);
//    }
//
//    private static int add(final String numbers, final String delimiter) {
//        int returnValue = 0;
//        String[] numbersArray = numbers.split(delimiter);
//        for (String number : numbersArray) {
//            if (!(number.trim().length() == 0)) {
//                returnValue += Integer.parseInt(number.trim());
//            }
//        }
//        return returnValue;
//    }

    //Requirement 7
//    public static int add(final String numbers) {
//        String delimiter = ",|\n";
//        String numbersWithoutDelimiter = numbers;
//        if (numbers.startsWith("//")) {
//            int delimiterIndex = numbers.indexOf("//") + 2;
//            delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
//            numbersWithoutDelimiter = numbers.substring(numbers.indexOf("\n") + 1);
//        }
//        return add(numbersWithoutDelimiter, delimiter);
//    }
//
//    private static int add(final String numbers, final String delimiter) {
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

    //Requirement 8
    public static int add(final String numbers) {
        String delimiter = ",|\n";
        String numbersWithoutDelimiter = numbers;
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("//") + 2;
            delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
            numbersWithoutDelimiter = numbers.substring(numbers.indexOf("\n") + 1);
        }
        return add(numbersWithoutDelimiter, delimiter);
    }

    private static int add(final String numbers, final String delimiter) {
        int returnValue = 0;
        List<Integer> negativeNumbers = new ArrayList();
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
