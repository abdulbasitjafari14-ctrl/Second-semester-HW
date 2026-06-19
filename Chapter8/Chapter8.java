package chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Chapter8 {
    
     private static final char EMPTY = ' ';
    private static final char X = 'X';
    private static final char O = 'O';
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        
        
//        Q_1
//        // Prompt the user to enter 10 numbers
//        System.out.println("Enter 10 numbers:");
//        int[] numbers = new int[10];
//        for (int i = 0; i < 10; i++) {
//            numbers[i] = scanner.nextInt();
//        }
//
//        // Eliminate duplicates and display the distinct numbers separated by exactly one space
//        int[] distinctNumbers = eliminateDuplicates(numbers);
//        System.out.print("The distinct numbers are: ");
//
//        for (int num : distinctNumbers) {
//            System.out.print(num + " ");
//        }
//
//        scanner.close();
//    }
//
//    // Method to return a new array by eliminating the duplicate values in the array
//    public static int[] eliminateDuplicates(int[] list) {
//        if (list == null || list.length == 0) {
//            throw new IllegalArgumentException("Array must not be null or empty");
//        }
//
//        boolean[] seen = new boolean[list.length];
//        int count = 0;
//
//        for (int i = 0; i < list.length; i++) {
//            if (!seen[i]) {
//                seen[i] = true;
//                list[count++] = list[i];
//            }
//        }
//
//        return Arrays.copyOf(list, count);
        




//    Q_2
//// Prompt the user to enter a 4-by-4 matrix row by row
//        System.out.println("Enter a 4-by-4 matrix row by row:");
//        double[][] matrix = new double[4][4];
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                matrix[i][j] = scanner.nextDouble();
//            }
//        }
//
//        // Display the sum of all elements in the major diagonal
//        double sumMajorDiagonal = sumMajorDiagonal(matrix);
//        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal);
//
//        scanner.close();
//    }
//
//    // Method to return the sum of all the numbers in the major diagonal in a matrix
//    public static double sumMajorDiagonal(double[][] m) {
//        if (m == null || m.length == 0 || m[0].length == 0) {
//            throw new IllegalArgumentException("Matrix must not be null or empty");
//        }
//
//        double sum = 0;
//
//        for (int i = 0; i < Math.min(m.length, m[0].length); i++) {
//            sum += m[i][i];
//        }
//
//        return sum;





//  Q_3
//// Sample data: Students with their scores and number of correct answers
//        String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Eve"};
//        int[] scores = {85, 92, 78, 88, 91};
//        int[] correctAnswers = {4, 6, 3, 5, 7};
//
//        // Create an array of Student objects
//        Student[] students = new Student[studentNames.length];
//        for (int i = 0; i < studentNames.length; i++) {
//            students[i] = new Student(studentNames[i], scores[i], correctAnswers[i]);
//        }
//
//        // Sort the students by their number of correct answers in ascending order
//        Arrays.sort(students, Comparator.comparingInt(Student::getCorrectAnswers));
//
//        // Display the sorted list of students
//        System.out.println("Students sorted by correct answers:");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }
//
//    static class Student implements Comparable<Student> {
//        private String name;
//        private int score;
//        private int correctAnswers;
//
//        public Student(String name, int score, int correctAnswers) {
//            this.name = name;
//            this.score = score;
//            this.correctAnswers = correctAnswers;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public int getScore() {
//            return score;
//        }
//
//        public int getCorrectAnswers() {
//            return correctAnswers;
//        }
//
//        @Override
//        public String toString() {
//            return "Student{name='" + name + "', score=" + score + ", correctAnswers=" + correctAnswers + "}";
//        }
//
//        @Override
//        public int compareTo(Student other) {
//            return Integer.compare(this.correctAnswers, other.correctAnswers);
//        }





//Q_4
// // Sample data: weekly hours for eight employees
//        int[][] weeklyHours = {
//            {2, 4, 3, 4, 5, 8, 8},
//            {7, 3, 4, 3, 3, 4, 4},
//            {3, 3, 4, 3, 3, 2, 2},
//            {9, 3, 4, 7, 3, 4, 1},
//            {3, 5, 4, 3, 6, 3, 8},
//            {3, 4, 4, 6, 3, 4, 4},
//            {3, 7, 4, 8, 3, 8, 4},
//            {6, 3, 5, 9, 2, 7, 9}
//        };
//
//        // Compute the total hours for each employee
//        int[] totalHours = new int[weeklyHours.length];
//
//        for (int i = 0; i < weeklyHours.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < weeklyHours[i].length; j++) {
//                sum += weeklyHours[i][j];
//            }
//            totalHours[i] = sum;
//        }
//
//        // Custom comparator to sort in descending order
//        Comparator<int[]> reverseOrderComparator = (a, b) -> {
//            if (b[0] == a[0]) {
//                return 0;
//            } else {
//                return b[0] - a[0];
//            }
//        };
//
//        // Sort the employees by their total hours in descending order
//        Arrays.sort(totalHours, reverseOrderComparator);
//
//        // Display the sorted list of employees and their total hours
//        System.out.println("Employees sorted by total hours:");
//        for (int i = 0; i < weeklyHours.length && i < totalHours.length; i++) {
//            int employeeId = i;
//            String employeeName = "Employee " + employeeId;
//            double totalHoursForEmployee = totalHours[i];
//            System.out.println(employeeName + ": " + totalHoursForEmployee);
//        }





//    Q_5
//// Example matrices
//        double[][] matrixA = {{1, 2},
//                                         {3, 4}};
//        
//        double[][] matrixB = {{5, 6}, 
//                                         {7, 8}};
//
//        // Add the matrices
//        double[][] resultMatrix = addMatrices(matrixA, matrixB);
//
//        // Display the result
//        System.out.println("The matrices are added as follows:");
//        for (double[] row : resultMatrix) {
//            for (double value : row) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    /**
//     * Adds two matrices.
//     *
//     * @param a The first matrix.
//     * @param b The second matrix.
//     * @return A new matrix containing the result of the addition.
//     */
//    public static double[][] addMatrices(double[][] a, double[][] b) {
//        int rows = a.length;
//        int cols = a[0].length;
//
//        // Create a new matrix to store the result
//        double[][] result = new double[rows][cols];
//
//        // Add corresponding elements from matrix1 and matrix2
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                result[i][j] = a[i][j] + b[i][j];
//            }
//        }
//
//        return result;



//    Q_6
//// Example matrices
//        double[][] matrixA = {{1, 2}, {3, 4}, {5, 6}};
//        double[][] matrixB = {{0, 2, 4}, {1, 4.5, 2.2}, {1.1, 4.3, 5.2}};
//
//        // Multiply the matrices
//        double[][] resultMatrix = multiplyMatrices(matrixA, matrixB);
//
//        // Display the result
//        System.out.println("The multiplication of the matrices is:");
//        for (double[] row : resultMatrix) {
//            for (double value : row) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    /**
//     * Multiplies two matrices.
//     *
//     * @param a The first matrix.
//     * @param b The second matrix.
//     * @return A new matrix containing the result of the multiplication.
//     */
//    public static double[][] multiplyMatrices(double[][] a, double[][] b) {
//        int rowsA = a.length;
//        int colsA = a[0].length;
//        int colsB = b[0].length;
//
//        // Check if the number of columns in A is equal to the number of rows in B
//        if (colsA != b.length) {
//            throw new IllegalArgumentException("The number of columns in matrix A must be the same as the number of rows in matrix B.");
//        }
//
//        // Create a new matrix to store the result
//        double[][] result = new double[rowsA][colsB];
//
//        // Perform matrix multiplication
//        for (int i = 0; i < rowsA; i++) {
//            for (int j = 0; j < colsB; j++) {
//                double sum = 0.0;
//                for (int k = 0; k < colsA; k++) {
//                    sum += a[i][k] * b[k][j];
//                }
//                result[i][j] = sum;
//            }
//        }
//
//        return result;




// Q_7
//double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
//                            {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3},
//                            {-1.5, 4, 2}, {5.5, 4, -0.5}};
//
//        double[] nearestPoint1 = findNearestPoints(points)[0];
//        double[] nearestPoint2 = findNearestPoints(points)[1];
//
//        System.out.println("Nearest points:");
//        System.out.println("Point 1: (" + nearestPoint1[0] + ", " + nearestPoint1[1] + ", " + nearestPoint1[2] + ")");
//        System.out.println("Point 2: (" + nearestPoint2[0] + ", " + nearestPoint2[1] + ", " + nearestPoint2[2] + ")");
//    }
//
//    public static double[][] findNearestPoints(double[][] points) {
//        if (points == null || points.length < 2) {
//            throw new IllegalArgumentException("At least two points are required.");
//        }
//
//        int numPoints = points.length;
//        double[][] distances = new double[numPoints][numPoints];
//        for (int i = 0; i < numPoints; i++) {
//            for (int j = i + 1; j < numPoints; j++) {
//                distances[i][j] = calculateDistance(points[i], points[j]);
//                distances[j][i] = distances[i][j]; // Ensure the matrix is symmetric
//            }
//        }
//
//        int minIndex = 0;
//        for (int i = 1; i < numPoints; i++) {
//            if (distances[minIndex][i] > distances[i][minIndex]) {
//                minIndex = i;
//            }
//        }
//
//        double[] nearestPoint1 = points[minIndex];
//        int secondMinIndex = -1;
//        for (int i = 0; i < numPoints; i++) {
//            if (distances[minIndex][i] == distances[i][minIndex]) {
//                if (secondMinIndex == -1 || distances[secondMinIndex][i] > distances[minIndex][i]) {
//                    secondMinIndex = i;
//                }
//            }
//        }
//
//        double[] nearestPoint2 = points[secondMinIndex];
//        return new double[][]{{nearestPoint1}, {nearestPoint2}};
//    }
//
//    public static double calculateDistance(double[] p1, double[] p2) {
//        return Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2) + Math.pow(p2[2] - p1[2], 2));        
    
    
    


//  Q_8
//        int numPoints = 8;
//        double[][] points = {{0, 0, 1}, {1, 1, -1}, {2, 2, -2},
//                            {-2, -2, 2}, {-3, -3, -3}, {-4, -4, -4},
//                            {5, 5, 5}};
//
//        double[][] closestPairs = findNearestPoints(points);
//
//        if (closestPairs != null && !closestPairs.isEmpty()) {
//            System.out.println("The closest " + closestPairs.size() + " pairs are:");
//            for (double[][] pair : closestPairs) {
//                System.out.println("(" + pair[0][0] + ", " + pair[0][1] + ", " + pair[0][2] + ") and (" + pair[1][0] + ", " +
//pair[1][1] + ", " + pair[1][2] + ")");
//            }
//        } else {
//            System.out.println("No closest pairs found.");
//        }
//    }
//
//    public static double[][] findNearestPoints(double[][] points) {
//        if (points == null || points.length < 2) {
//            throw new IllegalArgumentException("At least two points are required.");
//        }
//
//        int numPoints = points.length;
//        List<double[]> minPairs = new ArrayList<>();
//        double minDistance = Double.MAX_VALUE;
//
//        for (int i = 0; i < numPoints; i++) {
//            for (int j = i + 1; j < numPoints; j++) {
//                double distance = calculateDistance(points[i], points[j]);
//                if (distance < minDistance) {
//                    minPairs.clear();
//                    minPairs.add(new double[]{points[i], points[j]});
//                    minDistance = distance;
//                } else if (distance == minDistance) {
//                    minPairs.add(new double[]{points[i], points[j]});
//                }
//            }
//        }
//
//        return minPairs.toArray(new double[minPairs.size()][]);
//    }
//
//    public static double calculateDistance(double[] p1, double[] p2) {
//        return Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2) + Math.pow(p2[2] - p1[2], 2));





// Q_9
//       char[][] board = new char[3][3];
//       
//        boolean gameOver = false;
//
//        while (!gameOver) {
//            printBoard(board);
//
//            if (hasWinner(board, X)) {
//                System.out.println("X wins!");
//                gameOver = true;
//            } else if (hasWinner(board, O)) {
//                System.out.println("O wins!");
//                gameOver = true;
//            } else if (isBoardFull(board)) {
//                System.out.println("It's a draw!");
//                gameOver = true;
//            }
//
//            int row;
//            int col;
//
//            do {
//                System.out.print(X + " player, enter a row (0, 1, or 2): ");
//                row = scanner.nextInt();
//                System.out.print(O + " player, enter a column (0, 1, or 2): ");
//                col = scanner.nextInt();
//
//                if (board[row][col] == EMPTY) {
//                    board[row][col] = X;
//                    break;
//                } else {
//                    System.out.println("Invalid move. Try again.");
//                }
//            } while (true);
//
//            if (hasWinner(board, O)) {
//                System.out.println("O wins!");
//                gameOver = true;
//            } else if (isBoardFull(board)) {
//                System.out.println("It's a draw!");
//                gameOver = true;
//            }
//
//            row = -1;
//            col = -1;
//
//            do {
//                System.out.print(O + " player, enter a row (0, 1, or 2): ");
//                row = scanner.nextInt();
//                System.out.print(X + " player, enter a column (0, 1, or 2): ");
//                col = scanner.nextInt();
//
//                if (board[row][col] == EMPTY) {
//                    board[row][col] = O;
//                    break;
//                } else {
//                    System.out.println("Invalid move. Try again.");
//                }
//            } while (true);
//        }
//
//        scanner.close();
//    }
//
//    private static void printBoard(char[][] board) {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    private static boolean hasWinner(char[][] board, char player) {
//        // Check rows
//        for (int i = 0; i < board.length; i++) {
//            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
//                return true;
//            }
//        }
//
//        // Check columns
//        for (int j = 0; j < board[0].length; j++) {
//            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
//                return true;
//            }
//        }
//
//        // Check diagonals
//        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player)
//            || (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
//            return true;
//        }
//
//        return false;
//    }
//
//    private static boolean isBoardFull(char[][] board) {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                if (board[i][j] == EMPTY) {
//                    return false;
//                }
//            }
//        }
//
//        return true;



//    Q_10
//// Initialize the 4x4 matrix with random values (0 or 1)
//        Random random = new Random();
//        char[][] board = new char[4][4];
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                board[i][j] = (char) ('0' + random.nextInt(2));
//            }
//        }
//
//        // Print the matrix
//        System.out.println("Randomly filled 4x4 matrix:");
//        printMatrix(board);
//
//        // Find the first row with the most 1s
//        int largestRow = -1;
//        int largestCol = -1;
//        int maxOnesInRow = 0;
//
//        for (int i = 0; i < board.length; i++) {
//            int onesCount = 0;
//            for (int j = 0; j < board[i].length; j++) {
//                if (board[i][j] == '1') {
//                    onesCount++;
//                }
//            }
//
//            if (onesCount > maxOnesInRow) {
//                maxOnesInRow = onesCount;
//                largestRow = i;
//            }
//        }
//
//        // Find the first column with the most 1s
//        for (int j = 0; j < board[0].length; j++) {
//            int onesCount = 0;
//            for (int i = 0; i < board.length; i++) {
//                if (board[i][j] == '1') {
//                    onesCount++;
//                }
//            }
//
//            if (onesCount > maxOnesInRow) {
//                maxOnesInRow = onesCount;
//                largestCol = j;
//            }
//        }
//
//        // Print the largest row and column indices
//        System.out.println("Largest row index: " + largestRow);
//        System.out.println("Largest column index: " + largestCol);
//    }
//
//    private static void printMatrix(char[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }



//    Q_11
// // Initialize the 3x3 matrix with random values (0 or 1)
//        Random random = new Random();
//        char[][] board = new char[3][3];
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                board[i][j] = (char) ('0' + random.nextInt(2));
//            }
//        }
//
//        // Print the matrix
//        System.out.println("Randomly filled 3x3 matrix:");
//        printMatrix(board);
//
//        // Prompt the user to enter a number between 0 and 511
//       
//        int number = scanner.nextInt();
//
//        // Convert the decimal number to binary string
//        String binaryString = Integer.toBinaryString(number);
//
//        // Pad the binary string with leading zeros to match the matrix size (3x3)
//        while (binaryString.length() < 9) {
//            binaryString = "0" + binaryString;
//        }
//
//        // Print the corresponding matrix with 'H' and 'T'
//        System.out.println("Corresponding matrix:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (binaryString.charAt(i * 3 + j) == '1') {
//                    System.out.print('H');
//                } else {
//                    System.out.print('T');
//                }
//            }
//            System.out.println();
//        }
//
//        scanner.close();
//    }
//
//    private static void printMatrix(char[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }



//Q12
//// Constants for filing status
//        final int SINGLE_FILER = 0;
//        final int MARRIED_JOINT = 1;
//        final int MARRIED_SEPARATE = 2;
//        final int HEAD_OF_HOUSEHOLD = 3;
//
//        // Brackets and rates for each filing status
//        double[][] brackets = {
//            {8350, 33950, 82250, 171550, 372950}, // Single filer
//            {16700, 67900, 137050, 20885, 372950}, // Married jointly
//            {8350, 33950, 68525, 104425, 186475}, // Married separately
//            {11950, 45500, 117450, 190200, 372950} // Head of household
//        };
//
//        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
//
//        // Prompt the user to enter the filing status and taxable income
//
//        System.out.print("Enter your filing status (0 for single filer, 1 for married jointly, 2 for married separately, 3 for head of household): ");
//        int filingStatus = scanner.nextInt();
//        System.out.print("Enter your taxable income: ");
//        double taxableIncome = scanner.nextDouble();
//
//        // Compute the tax
//        double tax = computeTax(brackets, rates, filingStatus, taxableIncome);
//
//        // Print the result
//        System.out.printf("Your tax is $%.2f%n", tax);
//    }
//
//    // Method to compute tax based on brackets and rates
//    private static double computeTax(double[][] brackets, double[] rates, int filingStatus, double taxableIncome) {
//        if (filingStatus < 0 || filingStatus > 3) {
//            throw new IllegalArgumentException("Invalid filing status");
//        }
//
//        double tax = 0;
//        for (int i = 0; i < brackets.length; i++) {
//            if (taxableIncome <= brackets[i][0]) {
//                // Apply the first bracket
//                tax += taxableIncome * rates[i];
//                break;
//            } else if (taxableIncome > brackets[i][0] && taxableIncome <= brackets[i][1]) {
//                // Apply the second bracket
//                tax += (brackets[i][1] - brackets[i][0]) * rates[i];
//                taxableIncome -= brackets[i][1];
//            } else if (taxableIncome > brackets[i][1] && taxableIncome <= brackets[i][2]) {
//                // Apply the third bracket
//                tax += (brackets[i][2] - brackets[i][1]) * rates[i];
//                taxableIncome -= brackets[i][2];
//            } else if (taxableIncome > brackets[i][2] && taxableIncome <= brackets[i][3]) {
//                // Apply the fourth bracket
//                tax += (brackets[i][3] - brackets[i][2]) * rates[i];
//                taxableIncome -= brackets[i][3];
//            } else if (taxableIncome > brackets[i][3] && taxableIncome <= brackets[i][4]) {
//                // Apply the fifth bracket
//                tax += (brackets[i][4] - brackets[i][3]) * rates[i];
//                taxableIncome -= brackets[i][4];
//            } else {
//                // Apply the sixth bracket
//                tax += (taxableIncome - brackets[i][4]) * rates[i];
//                break;
//            }
//        }
//
//        return tax;
    




// Q13
// Prompt the user to enter the number of rows and columns
//        System.out.print("Enter the number of rows and columns of the array: ");
//        int rows = scanner.nextInt();
//        int cols = scanner.nextInt();
//
//        // Declare a 2D array of size rows x cols
//        double[][] array = new double[rows][cols];
//
//        // Prompt the user to enter the elements of the array
//        System.out.println("Enter the array:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                array[i][j] = scanner.nextDouble();
//            }
//        }
//
//        // Find the location of the largest element
//        int[] largestLocation = locateLargest(array);
//
//        // Print the location of the largest element
//        System.out.println("The location of the largest element is at (" + largestLocation[0] + ", " + largestLocation[1] + ")");
//    }
//
//    /**
//     * Finds the location of the largest element in a 2D array.
//     *
//     * @param array The 2D array to search for the largest element.
//     * @return An array containing the row and column indices of the largest element.
//     */
//    public static int[] locateLargest(double[][] array) {
//        if (array == null || array.length == 0 || array[0].length == 0) {
//            throw new IllegalArgumentException("Array is empty");
//        }
//
//        double max = Double.NEGATIVE_INFINITY;
//        int maxRow = -1;
//        int maxCol = -1;
//
//        // Iterate through the 2D array to find the largest element
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] > max) {
//                    max = array[i][j];
//                    maxRow = i;
//                    maxCol = j;
//                }
//            }
//        }
//
//        // Return the row and column indices of the largest element
//        return new int[]{maxRow, maxCol};


    


//Q14
// // Prompt the user to enter the length of the square matrix
//        System.out.print("Enter the size for the matrix: ");
//        int n = scanner.nextInt();
//
//        // Initialize a 2D array of size n x n with random values (0s and 1s)
//        boolean[][] matrix = new boolean[n][n];
//        Random random = new Random();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = random.nextBoolean();
//            }
//        }
//
//        // Print the matrix
//        printMatrix(matrix);
//
//        // Find rows with all 0s or 1s
//        boolean[] rowWithAllZeros = findRowsWithAllZeros(matrix);
//        boolean[] rowWithAllOnes = findRowsWithAllOnes(matrix);
//
//        // Find columns with all 0s or 1s
//        boolean[] colWithAllZeros = findColumnsWithAllZeros(matrix);
//        boolean[] colWithAllOnes = findColumnsWithAllOnes(matrix);
//
//        // Find diagonals with all 0s or 1s
//        boolean[] diagonalWithAllZeros = findDiagonalsWithAllZeros(matrix, n);
//        boolean[] diagonalWithAllOnes = findDiagonalsWithAllOnes(matrix, n);
//
//        // Print the results
//        System.out.println("Rows with all zeros on row 2: " + arrayToString(rowWithAllZeros));
//        System.out.println("Rows with all ones on row 4: " + arrayToString(rowWithAllOnes));
//
//        System.out.println("No same numbers on a column: " + arrayToString(colWithAllZeros));
//        System.out.println("No same numbers on the major diagonal: " + arrayToString(diagonalWithAllZeros));
//        System.out.println("No same numbers on the sub?diagonal: " + arrayToString(diagonalWithAllOnes));
//    }
//
//    // Helper method to print a 2D boolean array
//    private static void printMatrix(boolean[][] matrix) {
//        for (boolean[] row : matrix) {
//            for (boolean cell : row) {
//                System.out.print(cell ? "1" : "0");
//            }
//            System.out.println();
//        }
//    }
//
//    // Helper method to find rows with all 0s or 1s
//    private static boolean[] findRowsWithAllZeros(boolean[][] matrix) {
//        boolean[] result = new boolean[matrix.length];
//        for (int i = 0; i < matrix.length; i++) {
//            boolean allZeros = true;
//            for (boolean cell : matrix[i]) {
//                if (!cell) {
//                    allZeros = false;
//                    break;
//                }
//            }
//            result[i] = allZeros;
//        }
//        return result;
//    }
//
//    // Helper method to find rows with all 0s or 1s
//    private static boolean[] findRowsWithAllOnes(boolean[][] matrix) {
//        boolean[] result = new boolean[matrix.length];
//        for (int i = 0; i < matrix.length; i++) {
//            boolean allOnes = true;
//            for (boolean cell : matrix[i]) {
//                if (!cell) {
//                    allOnes = false;
//                    break;
//                }
//            }
//            result[i] = allOnes;
//        }
//        return result;
//    }
//
//    // Helper method to find columns with all 0s or 1s
//    private static boolean[] findColumnsWithAllZeros(boolean[][] matrix) {
//        boolean[] result = new boolean[matrix[0].length];
//        for (int j = 0; j < matrix[0].length; j++) {
//            boolean allZeros = true;
//            for (int i = 0; i < matrix.length; i++) {
//                if (!matrix[i][j]) {
//                    allZeros = false;
//                    break;
//                }
//            }
//            result[j] = allZeros;
//        }
//        return result;
//    }
//
//    // Helper method to find columns with all 0s or 1s
//    private static boolean[] findColumnsWithAllOnes(boolean[][] matrix) {
//        boolean[] result = new boolean[matrix[0].length];
//        for (int j = 0; j < matrix[0].length; j++) {
//            boolean allOnes = true;
//            for (int i = 0; i < matrix.length; i++) {
//                if (!matrix[i][j]) {
//                    allOnes = false;
//                    break;
//                }
//            }
//            result[j] = allOnes;
//        }
//        return result;
//    }
//
//    // Helper method to find diagonals with all 0s or 1s
//    private static boolean[] findDiagonalsWithAllZeros(boolean[][] matrix, int n) {
//        boolean[] result = new boolean[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = matrix[i][i];
//        }
//        return result;
//    }
//
//    // Helper method to find diagonals with all 0s or 1s
//    private static boolean[] findDiagonalsWithAllOnes(boolean[][] matrix, int n) {
//        boolean[] result = new boolean[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = !matrix[i][i];
//        }
//        return result;
//    }
//
//    // Helper method to convert a boolean array into a string
//    private static String arrayToString(boolean[] array) {
//        StringBuilder sb = new StringBuilder();
//        for (boolean element : array) {
//            sb.append(element ? "1" : "0").append(" ");
//        }
//        return sb.toString().trim();





//Q15
// // Prompt the user to enter five points
//        System.out.print("Enter five points: ");
//        double[][] points = new double[5][2];
//        for (int i = 0; i < 5; i++) {
//            System.out.print("x" + (i+1) + " and y" + (i+1) + ": ");
//            points[i][0] = scanner.nextDouble();
//            points[i][1] = scanner.nextDouble();
//        }
//
//        // Test whether all points are on the same line
//        boolean result = sameLine(points);
//
//        // Display the result
//        if (result) {
//            System.out.println("The five points are on the same line");
//        } else {
//            System.out.println("The five points are not on the same line");
//        }
//    }
//
//    /**
//     * Tests whether all the points in an array of points are on the same line.
//     *
//     * @param points The array of points to test.
//     * @return true if the points are on the same line, false otherwise.
//     */
//    public static boolean sameLine(double[][] points) {
//        // Calculate the slopes between consecutive points
//        double slope1 = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
//        double slope2 = (points[2][1] - points[1][1]) / (points[2][0] - points[1][0]);
//
//        // Check if all slopes are the same
//        return Math.abs(slope1 - slope2) < 0.0001;



//Q16
// int[][] matrix = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
//
//        // Sort the array using a two-pass method
//        sort(matrix);
//
//        // Print the sorted array
//        System.out.println("Sorted matrix:");
//        printMatrix(matrix);
//    }
//
//    /**
//     * Sorts a two-dimensional array using a two-pass method.
//     *
//     * @param m The 2D array to sort.
//     */
//    public static void sort(int[][] m) {
//        // Primary sort on rows
//        for (int i = 0; i < m.length - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < m.length; j++) {
//                if (m[j][0] < m[minIndex][0]) {
//                    minIndex = j;
//                }
//            }
//            swap(m, i, minIndex);
//        }
//
//        // Secondary sort on columns
//        for (int i = 0; i < m[0].length; i++) {
//            int[] col = new int[m.length];
//            for (int j = 0; j < m.length; j++) {
//                col[j] = m[j][i];
//            }
//            Arrays.sort(col);
//            for (int j = 0, k = 0; j < m.length; j++, k++) {
//                m[j][i] = col[k];
//            }
//        }
//    }
//
//    /**
//     * Swaps two rows of the array.
//     *
//     * @param m The 2D array.
//     * @param i The index of the first row.
//     * @param j The index of the second row.
//     */
//    private static void swap(int[][] m, int i, int j) {
//        int[] temp = m[i];
//        m[i] = m[j];
//        m[j] = temp;
//    }
//
//    /**
//     * Prints a 2D array.
//     *
//     * @param matrix The 2D array to print.
//     */
//    private static void printMatrix(int[][] matrix) {
//        for (int[] row : matrix) {
//            System.out.println(Arrays.toString(row));
//        }



//Q17 is skipped!!!!

//Q18
//int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
//
//        // Shuffle the rows of the matrix
//        shuffle(m);
//
//        // Print the shuffled matrix
//        System.out.println("Shuffled matrix:");
//        printMatrix(m);
//    }
//
//    /**
//     * Shuffles the rows in a two-dimensional array.
//     *
//     * @param m The 2D array to shuffle.
//     */
//    public static void shuffle(int[][] m) {
//        Random random = new Random();
//
//        // Get the number of rows and columns
//        int numRows = m.length;
//        int numCols = m[0].length;
//
//        // Swap each row with a randomly chosen row from the rest
//        for (int i = 0; i < numRows; i++) {
//            int j = random.nextInt(numRows);
//
//            // Ensure j != i to avoid swapping the same row with itself
//            if (j == i) {
//                continue;
//            }
//
//            // Swap the rows
//            for (int k = 0; k < numCols; k++) {
//                int temp = m[i][k];
//                m[i][k] = m[j][k];
//                m[j][k] = temp;
//            }
//        }
//    }
//
//    /**
//     * Prints a 2D array.
//     *
//     * @param matrix The 2D array to print.
//     */
//    private static void printMatrix(int[][] matrix) {
//        for (int[] row : matrix) {
//            System.out.println(Arrays.toString(row));
//        }





//Q22
//  // Generate a 6x6 matrix filled with 0s and 1s
//        boolean[][] matrix = generateRandomMatrix(6);
//
//        // Print the generated matrix
//        System.out.println("Generated matrix:");
//        printMatrix(matrix);
//
//        // Check if every row and every column have an even number of 1s
//        boolean isEvenMatrix = checkEvenMatrix(matrix);
//
//        // Output the result
//        if (isEvenMatrix) {
//            System.out.println("The generated matrix has an even number of 1s in each row and column.");
//        } else {
//            System.out.println("The generated matrix does not have an even number of 1s in each row or column.");
//        }
//    }
//
//    /**
//     * Generates a random 6x6 matrix filled with 0s and 1s.
//     *
//     * @param size The size of the matrix (must be 2 or greater).
//     * @return The generated 2D array representing the matrix.
//     */
//    public static boolean[][] generateRandomMatrix(int size) {
//        if (size < 2) {
//            throw new IllegalArgumentException("Size must be at least 2");
//        }
//
//        boolean[][] matrix = new boolean[size][size];
//        Random random = new Random();
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                matrix[i][j] = random.nextBoolean();
//            }
//        }
//
//        return matrix;
//    }
//
//    /**
//     * Prints a 2D array.
//     *
//     * @param matrix The 2D array to print.
//     */
//    private static void printMatrix(boolean[][] matrix) {
//        for (boolean[] row : matrix) {
//            for (boolean cell : row) {
//                System.out.print(cell ? "1" : "0");
//            }
//            System.out.println();
//        }
//    }
//
//    /**
//     * Checks if every row and every column of a matrix have an even number of 1s.
//     *
//     * @param matrix The 2D array to check.
//     * @return true if every row and every column have an even number of 1s, false otherwise.
//     */
//    private static boolean checkEvenMatrix(boolean[][] matrix) {
//        // Check rows
//        for (int i = 0; i < matrix.length; i++) {
//            int count = 0;
//            for (boolean cell : matrix[i]) {
//                if (cell) {
//                    count++;
//                }
//            }
//            if (count % 2 != 0) {
//                return false;
//            }
//        }
//
//        // Check columns
//        for (int j = 0; j < matrix[0].length; j++) {
//            int count = 0;
//            for (int i = 0; i < matrix.length; i++) {
//                if (matrix[i][j]) {
//                    count++;
//                }
//            }
//            if (count % 2 != 0) {
//                return false;
//            }
//        }
//
//        return true;        
        




//Q28
//
//        System.out.println("Enter list1: ");
//        int[][] m1 = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                m1[i][j] = scanner.nextInt();
//            }
//        }
//
//        System.out.println("Enter list2: ");
//        int[][] m2 = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                m2[i][j] = scanner.nextInt();
//            }
//        }
//
//        // Check if the two arrays are strictly identical
//        boolean isEqual = equals(m1, m2);
//
//        // Output the result
//        if (isEqual) {
//            System.out.println("The two arrays are strictly identical");
//        } else {
//            System.out.println("The two arrays are not strictly identical");
//        }
//    }
//
//    /**
//     * Compares two 3x3 arrays for equality.
//     *
//     * @param m1 The first 2D array to compare.
//     * @param m2 The second 2D array to compare.
//     * @return true if the two arrays are equal, false otherwise.
//     */
//    public static boolean equals(int[][] m1, int[][] m2) {
//        // Check if both arrays have the same dimensions
//        if (m1.length != m2.length || m1[0].length != m2[0].length) {
//            return false;
//        }
//
//        // Compare each element in the arrays
//        for (int i = 0; i < m1.length; i++) {
//            for (int j = 0; j < m1[i].length; j++) {
//                if (m1[i][j] != m2[i][j]) {
//                    return false;
//                }
//            }
//        }
//
//        return true;




////Q29
//        System.out.println("Enter list1: ");
//        int[][] m1 = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                m1[i][j] = scanner.nextInt();
//            }
//        }
//
//        System.out.println("Enter list2: ");
//        int[][] m2 = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                m2[i][j] = scanner.nextInt();
//            }
//        }
//
//        // Check if the two arrays are identical
//        boolean isEqual = equals(m1, m2);
//
//        // Output the result
//        if (isEqual) {
//            System.out.println("The two arrays are identical");
//        } else {
//            System.out.println("The two arrays are not identical");
//        }
//    }
//
//    /**
//     * Compares two 3x3 arrays for equality.
//     *
//     * @param m1 The first 2D array to compare.
//     * @param m2 The second 2D array to compare.
//     * @return true if the two arrays are equal, false otherwise.
//     */
//    public static boolean equals(int[][] m1, int[][] m2) {
//        // Check if both arrays have the same dimensions
//        if (m1.length != m2.length || m1[0].length != m2[0].length) {
//            return false;
//        }
//
//        // Compare each element in the arrays
//        for (int i = 0; i < m1.length; i++) {
//            for (int j = 0; j < m1[i].length; j++) {
//                if (m1[i][j] != m2[i][j]) {
//                    return false;
//                }
//            }
//        }
//
//        return true;

        
    }
    
}
