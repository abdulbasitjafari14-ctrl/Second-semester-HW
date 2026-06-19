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
        
        Scanner input = new Scanner(System.in);
        
        
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


    }
}
