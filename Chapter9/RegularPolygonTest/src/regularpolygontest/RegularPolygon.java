package regularpolygontest;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    // No-arg constructor
    public RegularPolygon() {
        this.n = 3;
        this.side = 1.0;
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor with specified number of sides and side length
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor with specified number of sides, side length, x- and y-coordinates
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Accessor methods for all data fields
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to calculate the perimeter of the polygon
    public double getPerimeter() {
        return n * side;
    }

    // Method to calculate the area of the polygon using the formula: Area = n * s2 / (4 * tan(pi/n))
    public double getArea() {
        double pi = Math.PI;
        return n * Math.pow(side, 2) / (4 * Math.tan(pi / n));
    }

    @Override
    public String toString() {
        return "RegularPolygon with n: " + n + ", side: " + side + ", x: " + x + ", y: " + y;
    }
}