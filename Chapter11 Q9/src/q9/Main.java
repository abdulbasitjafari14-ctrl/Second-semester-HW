/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q9;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    
    static int[] rowCounts;
    static int[] colCounts;
    public static void main(String[] args) {
        // Prompt the user for the array size n
        System.out.print("Enter the array size n: ");
        int n = Integer.parseInt(System.console().readLine());

        // Initialize the matrix with random 0s and 1s
        boolean[][] matrix = new boolean[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextBoolean();
            }
        }

        // Print the matrix
        System.out.println("The random array is:");
        printMatrix(matrix);

        // Find the largest row and column with the most 1s
        
        int[] rowCounts = findRowMaxes(matrix);
        int[] colCounts = findColMaxes(matrix);
        
        // Output the largest row index, largest column index (if there are multiple), and all columns with the largest count
        System.out.println("The largest row index: " + getIndexOfLargest(rowCounts));
        if (getIndexOfLargest(colCounts) != -1) {
            System.out.println("The largest column index: " + getIndexOfLargest(colCounts));
        }
        printColumnsWithMaxCount(matrix, getIndexOfLargest(colCounts));
    }

    
    // Helper method to print a matrix
    private static void printMatrix(boolean[][] matrix) {
        for (boolean[] row : matrix) {
            for (boolean cell : row) {
                System.out.print(cell ? "1" : "0");
            }
            System.out.println();
        }
    }

  
    
    
    
    // Helper method to find the indices of rows with the most 1s
    private static int[] findRowMaxes(boolean[][] matrix) {
        ArrayList<Integer> rowIndices = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (boolean cell : matrix[i]) {
                if (cell) {
                    count++;
                }
            }
            if (count > rowCounts[0]) 
            {
                rowIndices.clear();
                rowIndices.add(i);
            }
            else if (count == rowCounts[0])
            {
                rowIndices.add(i);
            }
        }
        return rowIndices.stream().mapToInt(Integer::intValue).toArray();
    }

    // Helper method to find the indices of columns with the most 1s
    private static int[] findColMaxes(boolean[][] matrix) {
        ArrayList<Integer> colCounts = new ArrayList<>();
        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j]) {
                    count++;
                }
            }
            if (count > colCounts[0]) {
                colCounts.clear();
                colCounts.add(j);
            } else if (count == colCounts[0]) {
                colCounts.add(j);
            }
        }
        return colCounts.stream().mapToInt(Integer::intValue).toArray();
    }

    // Helper method to get the index of the largest element in an array
    private static int getIndexOfLargest(int[] counts) {
        if (counts.length == 0) {
            return -1;
        }
        int maxIndex = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > counts[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Helper method to print columns with the largest count
    private static void printColumnsWithMaxCount(boolean[][] matrix, int colIndex) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][colIndex] ? "1" : "0");
        }
        System.out.println();
    }
}