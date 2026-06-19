package chapter8;
import java.util.Scanner;
public class FindingTheClosestPair {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number of points: ");
        int nOPoints = input.nextInt();
        
        double[][] Points = new double[nOPoints][2];
        System.out.println("enter "+nOPoints+" points sequintialy");
        for(int i = 0; i<Points.length; i++)
        {
            Points[i][0] = input.nextDouble();
            Points[i][1] = input.nextDouble();
        }
        
        int p1 = 0, p2 = 1;
        double shortestDistance = distance(Points[p1][0], Points[p1][1], Points[p2][0], Points[p2][1]);
        
        for(int i = 0; i<Points.length; i++)
        {
            for(int j = i + 1; j<Points.length; j++)
            {
                double distance = distance(Points[i][0], Points[i][1], Points[j][0], Points[j][1]);
                if(distance < shortestDistance)
                {
                    shortestDistance = distance;
                    p1 = i;
                    p2 = j;
                }
            }
        }
        
        System.out.println("the nearest point to each other is : \n(" +Points[p1][0]+", "+Points[p1][1]+")    ("+Points[p2][0]+", "+Points[p2][1]+")");
        
    }
    
public static double distance(double x1, double y1, double x2, double y2)
{
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
}
}
