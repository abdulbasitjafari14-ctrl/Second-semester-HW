package quadraticequationtest;

import java.util.Scanner;

public class QuadraticEquationTest {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation:");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        if (equation.getDiscriminant() > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("The roots of the equation are " + root1 + " and " + root2);
        } else if (equation.getDiscriminant() == 0) {
            double root1 = equation.getRoot1();
            System.out.println("The root of the equation is " + root1);
        } else {
            System.out.println("The equation has no roots.");
        }

        scanner.close();

    }
    
}
