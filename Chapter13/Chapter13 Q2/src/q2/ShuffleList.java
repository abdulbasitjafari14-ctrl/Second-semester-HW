/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShuffleList {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.println("Enter ten numbers: ");
        ArrayList<Number> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(input.next());
            list.add(num);
        }

        System.out.print("The list in the order entered is: ");
        for(Number number : list) {
                System.out.print(number + " ");
        }

        Collections.shuffle(list);

        System.out.print("\nThe list of numbers shuffled is: ");
        for (Number number : list) {
            System.out.print(number + " ");
        }
        }
}