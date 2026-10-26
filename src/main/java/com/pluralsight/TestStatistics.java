package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        // Create an array of 10 test scores.
        // (Makes array with 5 indexes, each with a double representing
        // your test scores)
        double[] testScores = {100.0,100.0,75.0,0,85.0};

    }

    // Method to display information to the terminal
    public static void display(double[] testScores) {
        double average = calculateAverage(testScores);
        double highScore = calculateHighestScore(testScores);
        double lowScore = calculateLowestScore(testScores);
        double median = calculateMedian(testScores);


    }

    // Method to calculate the average in a double array
    public static double calculateAverage(double[] array) {
        // Sum up all the values in the array. Assumed doubles
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        // Do the average math (sum / length) to return back the average
        return sum / array.length;
    }

    // Method to return the highest number in a double array
    public static double calculateHighestScore(double[] array) {
        // Compare "highestNumber" to the next value on the list,
        // if its higher or equal to the current highestNumber it becomes
        // the new highestNumber. Iterates over entire array.
        double highestNumber = 0;
        for (double num: array) {
            if (num >= highestNumber) {
                highestNumber = num;
            }
        }
        // Returns the highest double in the array
        return highestNumber;
    }

    // Method to return the lowest number in a double array
    public static double calculateLowestScore(double[] array) {
        // Compare "lowestNumber" to the next value on the list,
        // if its lower or equal to the current lowestNumber it becomes
        // the new lowestNumber. Iterates over entire array.
        double lowestNumber = 0;
        for (double num: array) {
            if (num < lowestNumber) {
                lowestNumber = num;
            }
        }
        // Returns the lowest double in the array
        return lowestNumber;
    }

    // Method to return the median value of a double array
    public static double calculateMedian(double[] array) {
        // Sort the array from lowest to highest
        Arrays.sort(array);
        // Get array length and check if the length is even or odd
        // Is a int because the index must be an int, not a double
        int length = array.length;
        if (length % 2 == 0) {
            // Array length is even, return the average of the
            // two middle elements of the array
            return (array[(length / 2) - 1] + array[length / 2]) / 2.0;
        } else {
            // Array length is odd, return the middle element of the array
            return array[length / 2];
        }
    }
}