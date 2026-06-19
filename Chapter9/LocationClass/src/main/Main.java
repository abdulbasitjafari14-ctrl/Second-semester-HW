package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in the array:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        double[][] array = new double[rows][cols];

        // Enter the array
        System.out.println("\nEnter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextDouble();
            }
        }

        // Find the location of the largest element
        LocationClass location = locateLargest(array);

        // Display the location of the largest element
        System.out.println("\nThe location of the largest element is " + location.getMaxValue() +
                           " at (" + location.getRow() + ", " + location.getColumn() + ")");

        scanner.close();
    }

    public static LocationClass locateLargest(double[][] a) {
        double maxValue = Double.MIN_VALUE;
        int row = -1;
        int col = -1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new LocationClass(row, col, maxValue);

    }
    
}
