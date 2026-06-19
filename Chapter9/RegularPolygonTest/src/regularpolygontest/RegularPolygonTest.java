package regularpolygontest;

public class RegularPolygonTest {

    public static void main(String[] args) {

 // Create a RegularPolygon object with default values
        RegularPolygon polygon1 = new RegularPolygon();
        System.out.println("\nRegular Polygon 1:");
        System.out.println(polygon1.toString());

        // Create a RegularPolygon object with specified number of sides and side length
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        System.out.println("\nRegular Polygon 2:");
        System.out.println(polygon2.toString());

        // Create a RegularPolygon object with specified number of sides, side length, x- and y-coordinates
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("\nRegular Polygon 3:");
        System.out.println(polygon3.toString());
        
        
    }
    
}
