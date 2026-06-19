package chapter7;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Chapter7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
//        Q_1
//        System.out.print("Enter the number of student: ");
//        int Snum = input.nextInt();
//        
//        int[] Score = new int[Snum];
//        System.out.print("Enter "+Snum+" score: ");
//        for(int i = 0; i<Snum; i++)
//        {
//            Score[i] = input.nextInt();
//        }
//        int best = 0;
//        for(int i = 0; i<Snum; i++)
//        {
//            if(Score[i]>best)
//                best = Score[i];
//            else;
//        }
//       
//        for(int i = 0; i<Snum; i++)
//        {
//            if(Score[i]>= best-10)
//                System.out.println("Student "+i+" score is "+Score[i]+" and grade is A");
//            else if(Score[i]>= best-20)
//                System.out.println("Student "+i+" score is "+Score[i]+" and grade is B");
//            else if(Score[i]>= best-30)
//                System.out.println("Student "+i+" score is "+Score[i]+" and grade is C");
//            else if(Score[i]>= best-40)
//                System.out.println("Student "+i+" score is "+Score[i]+" and grade is D");
//            else
//                System.out.println("Student "+i+" score is "+Score[i]+" and grade is F");
//                
//        }



//        Q_2
//        int[] numbers = new int[10];
//        System.out.print("enter 10 numbers : ");
//        for(int i = 0; i<numbers.length; i++)
//        {
//            numbers[i] = input.nextInt();
//        }
//        System.out.println("--------------");
//        for(int i = numbers.length-1; i>=0; i--)
//        {
//            System.out.println(numbers[i]);
//        }
            
//         Q_3
//        Map<Integer, Integer> countMap = new HashMap<>();
//
//        // Read integers from the user until 0 is entered
//        while (true) {
//            int number = input.nextInt();
//            if (number == 0) {
//                break;
//            }
//            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
//            }
//
//        // Display the results in increasing order
//        for (int i = 1; i <= 100; i++) {
//            if (countMap.containsKey(i)) {
//                System.out.println(i + " occurs " + countMap.get(i) + " times");
//            }
//        }


//        Q_4
// // Initialize variables to store the total sum of scores, count of positive scores, and count of negative scores
//        int totalSum = 0;
//        int countPositiveScores = 0;
//        int countNegativeScores = 0;
//
//        // Read scores until a negative number is entered
//        while (true) {
//            int score = input.nextInt();
//            if (score < 0) {
//                break; // Exit the loop when a negative number is read
//            }
//
//            totalSum += score;
//            countPositiveScores++; // Increment count for positive scores
//
//            // Continue reading until a negative number is read
//        }
//
//        // Calculate the average of the scores
//        double average = (double) totalSum / countPositiveScores;
//
//        // Display the results
//        System.out.println("Total sum of scores: " + totalSum);
//        System.out.println("Count of positive scores: " + countPositiveScores);
//        System.out.println("Average score: " + average);
//
//        // Determine how many scores are above or equal to the average and how many are below the average
//        int countAboveOrEqual = 0;
//        int countBelowAverage = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i >= average) {
//                countAboveOrEqual++;
//            } else if (i < average) {
//                countBelowAverage++;
//            }
//        }
//
//        System.out.println("Count of scores above or equal to the average: " + countAboveOrEqual);
//        System.out.println("Count of scores below the average: " + countBelowAverage);
  



//    Q_5
//// Initialize an array to store distinct numbers
//        int[] distinctNumbers = new int[10];
//        int countDistinct = 0;
//
//        // Read the first number
//        int num = input.nextInt();
//        distinctNumbers[countDistinct++] = num;
//
//        // Read the remaining 9 numbers
//        for (int i = 1; i < 10; i++) {
//            int currentNum = input.nextInt();
//
//            // Check if the current number is already in the array
//            boolean isDuplicate = false;
//            for (int j = 0; j < countDistinct; j++) {
//                if (distinctNumbers[j] == currentNum) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//
//            // If it's not a duplicate, add it to the array
//            if (!isDuplicate) {
//                distinctNumbers[countDistinct++] = currentNum;
//            }
//        }
//
//        // Display the number of distinct numbers and the distinct numbers in their input order
//        System.out.println("The number of distinct numbers is " + countDistinct);
//        System.out.print("The distinct numbers are: ");
//        for (int i = 0; i < countDistinct; i++) {
//            if (i > 0) {
//                System.out.print(" "); // Add a space between distinct numbers
//            }
//            System.out.print(distinctNumbers[i]);
//        }



//    Q_6
//        int limit = 100; // You can change this value to find more primes
//        int[] primes = sieveOfEratosthenes(limit);
//
//        System.out.println("The first " + primes.length + " prime numbers are:");
//        for (int prime : primes) {
//            System.out.print(prime + " ");
//        }
//    }
//
//    // Sieve of Eratosthenes algorithm to find all primes less than or equal to n
//    public static int[] sieveOfEratosthenes(int n) {
//        boolean[] isPrime = new boolean[n + 1];
//        Arrays.fill(isPrime, true);
//
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (isPrime[i]) {
//                for (int j = i * i; j <= n; j += i) {
//                    isPrime[j] = false;
//                }
//            }
//        }
//
//        int count = 0;
//        for (int i = 2; i <= n; i++) {
//            if (isPrime[i]) {
//                count++;
//                if (count == 50) break;
//            }
//        }
//
//        // Extract the first 50 primes
//        int[] primeNumbers = new int[50];
//        for (int i = 2, j = 0; i <= n && j < 50; i++) {
//            if (isPrime[i]) {
//                primeNumbers[j++] = i;
//            }
//        }
//
//        return primeNumbers;


//Q_7
//// Array to store counts of digits from 0 to 9
//        int[] counts = new int[10];
//
//        // Generate 100 random integers between 0 and 9
//        Random random = new Random();
//        for (int i = 0; i < 100; i++) {
//            int number = random.nextInt(10);
//            counts[number]++;
//        }
//
//        // Display the counts
//        System.out.println("Counts of each digit from 0 to 9:");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i + ": " + counts[i]);
//        }

//Q_8
//        
//         if (array == null || array.length == 0) {
//            throw new IllegalArgumentException("Array must not be null or empty");
//        }
//
//        double sum = 0;
//        for (int num : array) {
//            sum += num;
//        }
//        return sum / array.length;
//    }
//
//    // Overloaded method to calculate the average of a double[] array
//    public static double average(double[] array) {
//        if (array == null || array.length == 0) {
//            throw new IllegalArgumentException("Array must not be null or empty");
//        }
//
//        double sum = 0;
//        for (double num : array) {
//            sum += num;
//        }
//        return sum / array.length;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter 10 integers
//        System.out.println("Enter 10 integers:");
//        int[] integerArray = new int[10];
//        for (int i = 0; i < 10; i++) {
//            integerArray[i] = scanner.nextInt();
//        }
//
//        // Calculate and display the average of the integers
//        double averageIntegers = average(integerArray);
//        System.out.println("Average of integers: " + averageIntegers);
//
//        // Prompt the user to enter 10 double values
//        System.out.println("Enter 10 double values:");
//        double[] doubleArray = new double[10];
//        for (int i = 0; i < 10; i++) {
//            doubleArray[i] = scanner.nextDouble();
//        }
//
//        // Calculate and display the average of the doubles
//        double averageDoubles = average(doubleArray);
//        System.out.println("Average of doubles: " + averageDoubles);
//
//        scanner.close();



//Q_9
//        if (array == null || array.length == 0) {
//            throw new IllegalArgumentException("Array must not be null or empty");
//        }
//
//        double min = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        return min;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter 10 numbers
//        System.out.println("Enter 10 numbers:");
//        double[] numbers = new double[10];
//        for (int i = 0; i < 10; i++) {
//            numbers[i] = scanner.nextDouble();
//        }
//
//        // Calculate and display the minimum value using the min method
//        double minValue = min(numbers);
//        System.out.println("The minimum number is: " + minValue);
//
//        scanner.close();



//Q_10
//        if (array == null || array.length == 0) {
//            throw new IllegalArgumentException("Array must not be null or empty");
//        }
//
//        double minValue = array[0];
//        int minIndex = 0;
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < minValue) {
//                minValue = array[i];
//                minIndex = i;
//            }
//        }
//
//        return minIndex;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter 10 numbers
//        System.out.println("Enter 10 numbers:");
//        double[] numbers = new double[10];
//        for (int i = 0; i < 10; i++) {
//            numbers[i] = scanner.nextDouble();
//        }
//
//        // Calculate and display the index of the smallest element using the indexOfSmallestElement method
//        int minIndex = indexOfSmallestElement(numbers);
//        System.out.println("The index of the minimum number is: " + minIndex);
//
//        scanner.close();




//       Q_11
//        // Prompt the user to enter 10 numbers
//        System.out.println("Enter 10 numbers:");
//        double[] numbers = new double[10];
//        for (int i = 0; i < 10; i++) {
//            numbers[i] = input.nextDouble();
//        }
//
//        // Calculate and display the mean
//        double mean = mean(numbers);
//        System.out.println("The mean is: " + mean);
//
//        // Calculate and display the standard deviation using the deviation method
//        double stdDeviation = deviation(numbers);
//        System.out.println("The standard deviation is: " + stdDeviation);
//
//        input.close();
//    }
//
//    // Method to compute the mean of an array of double values
//    public static double mean(double[] x) {
//        if (x == null || x.length == 0) {
//            throw new IllegalArgumentException("Array must not be null or empty");
//        }
//
//        double sum = 0;
//        for (double num : x) {
//            sum += num;
//        }
//        return sum / x.length;
//    }
//
//    // Method to compute the deviation of an array of double values
//    public static double deviation(double[] x) {
//        if (x == null || x.length == 0) {
//            throw new IllegalArgumentException("Array must not be null or empty");
//        }
//
//        double mean = mean(x);
//        double sumOfSquares = 0;
//
//        for (double num : x) {
//            sumOfSquares += Math.pow(num - mean, 2);
//        }
//
//        return Math.sqrt(sumOfSquares / (x.length - 1));




//    Q_12
//// Prompt the user to enter 10 numbers
//        System.out.println("Enter 10 numbers:");
//        int[] numbers = new int[10];
//        for (int i = 0; i < 10; i++) {
//            numbers[i] = input.nextInt();
//        }
//
//        // Reverse the array using the reverse method
//        int[] reversedArray = reverse(numbers);
//
//        // Display the reversed numbers
//        System.out.println("The reversed array is:");
//        for (int num : reversedArray) {
//            System.out.print(num + " ");
//        }
//
//        input.close();
//    }
//
//    // Method to reverse an array passed in the argument and return it
//    public static int[] reverse(int[] arr) {
//        if (arr == null || arr.length == 0) {
//            throw new IllegalArgumentException("Array must not be null or empty");
//        }
//
//        int[] reversed = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            reversed[i] = arr[arr.length - 1 - i];
//        }
//
//        return reversed;


//    Q_13
//Random random = new Random();
//
//        // Generate 45 random numbers between 1 and 100 excluding 4,8,95, and 93
//        for (int i = 0; i < 45; i++) {
//            int randomNumber = getRandom(1, 100, 4, 8, 95, 93);
//            System.out.printf("%4d", randomNumber);
//
//            if ((i + 1) % 15 == 0) {
//                System.out.println();
//            }
//        }
//    }
//
//    // Method to return a random number between start and end, excluding the numbers
//    public static int getRandom(int start, int end, int... numbers) {
//        if (start > end || start < 0 || end >= 100) {
//            throw new IllegalArgumentException("Invalid range");
//        }
//
//        int[] allNumbers = new int[end - start + 1];
//        for (int i = 0; i < allNumbers.length; i++) {
//            allNumbers[i] = start + i;
//        }
//
//        // Remove the numbers that are to be excluded
//        int countToRemove = 0;
//        for (int number : numbers) {
//            if (number >= start && number <= end) {
//                countToRemove++;
//            }
//        }
//
//        int[] filteredNumbers = new int[allNumbers.length - countToRemove];
//        int filteredIndex = 0;
//
//        for (int i = 0; i < allNumbers.length; i++) {
//            if (!Arrays.asList(numbers).contains(allNumbers[i])) {
//                filteredNumbers[filteredIndex++] = allNumbers[i];
//            }
//        }
//
//        // Generate a random index from the remaining numbers
//        int randomIndex = random.nextInt(filteredNumbers.length);
//        return filteredNumbers[randomIndex];


//     Q_14
//// Prompt the user to enter five numbers
//        System.out.println("Enter five numbers:");
//        int[] numbers = new int[5];
//        for (int i = 0; i < 5; i++) {
//            numbers[i] = input.nextInt();
//        }
//
//        // Compute the GCD using the gcd method
//        int gcd = gcd(numbers);
//
//        // Display the GCD
//        System.out.println("The GCD of the numbers is: " + gcd);
//
//        input.close();
//    }
//
//    // Method to return the gcd of an unspecified number of integers
//    public static int gcd(int... numbers) {
//        if (numbers == null || numbers.length == 0) {
//            throw new IllegalArgumentException("Array must not be null or empty");
//        }
//
//        int result = numbers[0];
//
//        for (int i = 1; i < numbers.length; i++) {
//            while (numbers[i] != 0) {
//                int temp = numbers[i];
//                numbers[i] = numbers[i] % result;
//                result = temp;
//            }
//        }
//
//        return result;



//  Q_15
//// Prompt the user to enter 10 numbers
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
//        input.close();
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




////Q16
//// Generate an array of 100,000 random integers
//        int[] array = generateRandomArray(100000);
//
//        // Prompt the user to enter a key to search for
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the key to search for: ");
//        int key = scanner.nextInt();
//
//        // Estimate the execution time of invoking the linearSearch method
//        long startTime = System.nanoTime();
//        int indexLinear = linearSearch(array, key);
//        long endTimeLinear = System.nanoTime();
//        long executionTimeLinear = endTimeLinear - startTime;
//        System.out.printf("Execution time for linear search: %.4f ms%n", executionTimeLinear / 1000.0);
//
//        // Sort the array
//        sortArray(array);
//
//        // Estimate the execution time of invoking the binarySearch method
//        long startTimeBinary = System.nanoTime();
//        int indexBinary = binarySearch(array, key);
//        long endTimeBinary = System.nanoTime();
//        long executionTimeBinary = endTimeBinary - startTimeBinary;
//        System.out.printf("Execution time for binary search: %.4f ms%n", executionTimeBinary / 1000.0);
//    }
//
//    /**
//     * Generates an array of random integers.
//     *
//     * @param size The size of the array to generate.
//     * @return The generated 2D array representing the matrix.
//     */
//    public static int[] generateRandomArray(int size) {
//        Random random = new Random();
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = random.nextInt(1000);
//        }
//        return array;
//    }
//
//    /**
//     * Sorts the array using the insertion sort algorithm.
//     *
//     * @param array The 2D array to sort.
//     */
//    public static void sortArray(int[] array) {
//        for (int i = 1; i < array.length; i++) {
//            int key = array[i];
//            int j = i - 1;
//            while (j >= 0 && array[j] > key) {
//                array[j + 1] = array[j];
//                j--;
//            }
//            array[j + 1] = key;
//        }
//    }
//
//    /**
//     * Searches for a key in the array using linear search.
//     *
//     * @param array The 2D array to search.
//     * @param key The key to search for.
//     * @return The index of the key if found, -1 otherwise.
//     */
//    public static int linearSearch(int[] array, int key) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == key) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    /**
//     * Searches for a key in the array using binary search.
//     *
//     * @param array The 2D array to search.
//     * @param key The key to search for.
//     * @return The index of the key if found, -1 otherwise.
//     */
//    public static int binarySearch(int[] array, int key) {
//        return binarySearchRecursive(array, key, 0, array.length - 1);
//    }
//
//    /**
//     * Recursive helper method for binary search.
//     *
//     * @param array The 2D array to search.
//     * @param key The key to search for.
//     * @param low The lower index of the search range.
//     * @param high The upper index of the search range.
//     * @return The index of the key if found, -1 otherwise.
//     */
//    private static int binarySearchRecursive(int[] array, int key, int low, int high) {
//        if (low > high) {
//            return -1;
//        }
//        int mid = (low + high) / 2;
//
//        if (array[mid] == key) {
//            return mid;
//        } else if (array[mid] < key) {
//            return binarySearchRecursive(array, key, mid + 1, high);
//        } else {
//            return binarySearchRecursive(array, key, low, mid - 1);
//        }





////Q17
//// Prompt the user to enter the number of students
//        System.out.print("Enter the number of students: ");
//        int numStudents = scanner.nextInt();
//
//        // Initialize an ArrayList to store student names and their scores
//        ArrayList<String[]> students = new ArrayList<>();
//
//        // Prompt the user to enter the students' names and scores
//        for (int i = 0; i < numStudents; i++) {
//            System.out.print("Student " + (i+1) + ": ");
//            String name = scanner.next();
//            System.out.print("Score: ");
//            double score = scanner.nextDouble();
//
//            // Add the student's name and score as an array to the ArrayList
//            students.add(new String[]{name, Double.toString(score)});
//        }
//
//        // Sort the students based on their scores in descending order
//        sortStudents(students);
//
//        // Print the sorted list of students
//        System.out.println("Sorted list of students:");
//        for (String[] student : students) {
//            System.out.printf("%s: %.2f%n", student[0], student[1]);
//        }
//    }
//
//    /**
//     * Sorts an ArrayList of strings based on their scores in descending order.
//     *
//     * @param students The ArrayList of strings to sort.
//     */
//    public static void sortStudents(ArrayList<String[]> students) {
//        // Sort the array list using bubble sort
//        for (int i = 0; i < students.size() - 1; i++) {
//            for (int j = 0; j < students.size() - i - 1; j++) {
//                String[] student1 = students.get(j);
//                String[] student2 = students.get(j + 1);
//
//                // Compare the scores and swap if necessary
//                if (Double.parseDouble(student1[1]) < Double.parseDouble(student2[1])) {
//                    students.set(j, student2);
//                    students.set(j + 1, student1);
//                }
//            }
//        }




////Q18
//        // Prompt the user to enter 10 double numbers
//        System.out.print("Enter 10 double numbers: ");
//        double[] numbers = new double[10];
//        for (int i = 0; i < 10; i++) {
//            numbers[i] = scanner.nextDouble();
//        }
//
//        // Sort the array using bubble sort
//        bubbleSort(numbers);
//
//        // Print the sorted list of numbers
//        System.out.println("Sorted list:");
//        for (double num : numbers) {
//            System.out.print(num + " ");
//        }
//    }
//
//    /**
//     * Bubble sorts an array of doubles.
//     *
//     * @param arr The array to sort.
//     */
//    public static void bubbleSort(double[] arr) {
//        // Perform n-1 passes through the array
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                // Compare adjacent elements and swap if they are in the wrong order
//                if (arr[j] > arr[j + 1]) {
//                    double temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }



////Q19
//// Prompt the user to enter the size of the list
//        System.out.print("Enter the size of the list: ");
//        int size = scanner.nextInt();
//
//        // Initialize an array to store the list of integers
//        int[] list = new int[size];
//
//        // Prompt the user to enter the contents of the list
//        for (int i = 0; i < size; i++) {
//            System.out.print("Enter element " + (i+1) + ": ");
//            list[i] = scanner.nextInt();
//        }
//
//        // Check if the list is sorted in nondecreasing order
//        boolean isSorted = isSorted(list);
//
//        // Output the result
//        System.out.println("The list has " + size + " integers " + Arrays.toString(list));
//        if (isSorted) {
//            System.out.println("The list is already sorted");
//        } else {
//            System.out.println("The list is not sorted");
//        }
//    }
//
//    /**
//     * Checks if the array is sorted in nondecreasing order.
//     *
//     * @param arr The array to check.
//     * @return true if the array is sorted, false otherwise.
//     */
//    public static boolean isSorted(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                return false;
//            }
//        }
//        return true;




////Q20
//// Prompt the user to enter 10 double numbers
//        System.out.print("Enter 10 double numbers: ");
//        double[] numbers = new double[10];
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Enter element " + (i+1) + ": ");
//            numbers[i] = scanner.nextDouble();
//        }
//
//        // Sort the array using selection sort
//        selectionSort(numbers);
//
//        // Print the sorted list of numbers
//        System.out.println("Sorted list:");
//        for (double num : numbers) {
//            System.out.print(num + " ");
//        }
//    }
//
//    /**
//     * Selection sorts an array of doubles.
//     *
//     * @param arr The array to sort.
//     */
//    public static void selectionSort(double[] arr) {
//        int n = arr.length;
//
//        // Traverse through all array elements
//        for (int i = 0; i < n - 1; i++) {
//            // Find the index of the largest number in the unsorted part
//            int maxIndex = i;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] > arr[maxIndex]) {
//                    maxIndex = j;
//                }
//            }
//
//            // Swap the found maximum element with the last element of the unsorted part
//            double temp = arr[i];
//            arr[i] = arr[maxIndex];
//            arr[maxIndex] = temp;
//        }




////Q21
//        // Check if no arguments are provided
//        if (args.length == 0) {
//            System.out.println("No arguments provided");
//            return;
//        }
//
//        // Convert the string arguments to integers and sum them up
//        int total = 0;
//        for (String arg : args) {
//            try {
//                total += Integer.parseInt(arg);
//            } catch (NumberFormatException e) {
//                System.out.println("Argument " + arg + " is not a valid integer");
//                return;
//            }
//        }
//
//        // Print the sum of all integers
//        System.out.println("The sum of all integers is: " + total);




    }
}
