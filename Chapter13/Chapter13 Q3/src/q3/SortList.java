/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortList {
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

        Collections.sort(list);

        System.out.print("\nThe sorted list of numbers is: ");
        for (Number number : list) {
            System.out.print(number + " ");
        }
        }
}