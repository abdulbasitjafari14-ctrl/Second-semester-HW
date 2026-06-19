package rectangletest;

public class Rectangle {
    
    private double width;
    private double height;

    // No-arg constructor
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // Constructor with specified width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area of the rectangle
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    
    }
}
