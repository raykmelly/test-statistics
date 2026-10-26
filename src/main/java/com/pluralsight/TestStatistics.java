package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        // Create an array of 10 test scores.
        // (Makes array with 5 indexes, each with a double representing
        // your test scores)
        double[] testScores = {100,100,95,0,85};

        // Display the information about your test scores array
        display(testScores);
    }

    // Method to display information to the terminal
    public static void display(double[] testScores) {
        // Calculate the average, high-score, low-score, and median
        double average = calculateAverage(testScores);
        double highScore = calculateHighestScore(testScores);
        double lowScore = calculateLowestScore(testScores);
        double median = calculateMedian(testScores);
        // Display the current scores in the array
        System.out.println("-> Here are your test scores!");
        for (double score : testScores) {
            System.out.printf("[%.2f]%n",score);
        }
        // Display the average, high-score, low-score, and median
        System.out.println("-> Here's some metrics on your test scores...");
        System.out.printf("[AVERAGE]: %.2f%n", average);
        System.out.printf("[HIGHEST SCORE]: %.2f%n", highScore);
        System.out.printf("[LOWEST SCORE]: %.2f%n", lowScore);
        System.out.printf("[MEDIAN SCORE]: %.2f%n", median);
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