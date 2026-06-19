package  Rectangletest;



import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        
        // Create a Rectangle object with width 4 and height 40
        Rectangle rect1 = new Rectangle(4.0, 40.0);
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        // Create a Rectangle object with width 3.5 and height 35.9
        Rectangle rect2 = new Rectangle(3.5, 35.9);
        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
        
    }
    
}

