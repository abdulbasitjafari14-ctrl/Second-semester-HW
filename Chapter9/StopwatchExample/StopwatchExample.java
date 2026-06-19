package  StopwatchExample;

import java.util.Arrays;

public class  StopwatchExample {

    public static void main(String[] args) {


         int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }

        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(numbers));

        // Create a StopWatch instance and start the timer
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        // Sort the array using selection sort
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        // Stop the timer
        stopwatch.stop();

        // Display the sorted array and elapsed time
        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Elapsed Time: " + stopwatch.getElapsedTime() + " milliseconds");
        
    }
    
}
