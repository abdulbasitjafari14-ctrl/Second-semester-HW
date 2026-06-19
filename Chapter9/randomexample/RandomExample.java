package randomexample;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {

 // Create a Random object with seed 1000
        Random random = new Random(1000);

        // Generate the first 50 random integers between 0 and 100
        for (int i = 0; i < 50; i++) {
            int randomNumber = random.nextInt(101);
            System.out.println("Random Integer " + (i + 1) + ": " + randomNumber);
        }

    }
    
}
