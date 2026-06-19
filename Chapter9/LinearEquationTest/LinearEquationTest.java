package linearequationtest;

import java.util.Scanner;

public class LinearEquationTest {

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the linear equations:");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        System.out.print("d: ");
        double d = scanner.nextDouble();
        System.out.print("e: ");
        double e = scanner.nextDouble();
        System.out.print("f: ");
        double f = scanner.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            double x = equation.getX();
            double y = equation.getY();
            System.out.println("The solution for the equations is x = " + x + ", y = " + y);
        } else {
            System.out.println("The equations have no solution.");
        }

        scanner.close();
        
    }
    
}
