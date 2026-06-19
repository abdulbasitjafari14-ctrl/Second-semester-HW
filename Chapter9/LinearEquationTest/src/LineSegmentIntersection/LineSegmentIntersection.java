package LineSegmentIntersection;

import java.util.Scanner;

public class LineSegmentIntersection {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the endpoints of the first line segment:");
        System.out.print("x1, y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("x2, y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("\nEnter the endpoints of the second line segment:");
        System.out.print("x3, y3: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        System.out.print("x4, y4: ");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        System.out.print("x5, y5: ");
        double x5 = scanner.nextDouble();
        double y5 = scanner.nextDouble();
        // Define the equations of the two lines
        LinearEquation line1 = new LinearEquation(y2 - y1, -(x2 - x1), (y3 - y1) * (x1 - x2) + (x3 - x1) * (y1 - y2));
        
        LinearEquation line2 = new LinearEquation(y4 - y3, -(x4 - x3), (y5 - y3) * (x3 - x4) + (x5 - x3) * (y3 - y4));

        // Solve the system of equations
        if (line1.isSolvable() && line2.isSolvable()) {
            double x = line1.getX();
            double y = line1.getY();

            System.out.println("The intersecting point is: (" + x + ", " + y + ")");
        } else {
            System.out.println("The lines do not intersect.");
        }

        scanner.close();
        
        
    }
    
}
