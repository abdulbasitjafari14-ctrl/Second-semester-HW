package q1;

import java.awt.Color;
import java.util.Scanner;
import java.awt.Color;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sides of the triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        System.out.print("Enter the color of the triangle (black, white, red): ");
        String color = scanner.next();

        System.out.print("Is the triangle filled? (true/false): ");
        boolean filled = scanner.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
