package linearequationtest;

public class LinearEquation {

private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    // No-arg constructor
    public LinearEquation() {
        this.a = 1.0;
        this.b = 1.0;
        this.c = 1.0;
        this.d = 1.0;
        this.e = 1.0;
        this.f = 1.0;
    }

    // Constructor with specified values for a, b, c, d, e, and f
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Accessor methods for a, b, c, d, e, and f
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    // Method to check if the equation is solvable
    public boolean isSolvable() {
        return a * d - b * c != 0;
    }

    // Method to get the solution for x using the quadratic formula
    public double getX() {
        if (isSolvable()) {
            double x = (e * d - b * f) / (a * d - b * c);
            return x;
        } else {
            return 0.0;
        }
    }

    // Method to get the solution for y using the quadratic formula
    public double getY() {
        if (isSolvable()) {
            double y = (a * f - e * c) / (a * d - b * c);
            return y;
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "LinearEquation with a: " + a + ", b: " + b + ", c: " + c + ", d: " + d + ", e: " + e + ", f: " + f;
    }
    
}
