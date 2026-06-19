package quadraticequationtest;

public class QuadraticEquation {

private double a;
    private double b;
    private double c;

    // No-arg constructor
    public QuadraticEquation() {
        this.a = 1.0;
        this.b = 1.0;
        this.c = 1.0;
    }

    // Constructor with specified values for a, b, and c
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Accessor methods for a, b, and c
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Method to calculate the discriminant
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    // Method to calculate the first root using the quadratic formula
    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return 0.0;
        }
    }

    // Method to calculate the second root using the quadratic formula
    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "QuadraticEquation with a: " + a + ", b: " + b + ", c: " + c;
    }
    
}
