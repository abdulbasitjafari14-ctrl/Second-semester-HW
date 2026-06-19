package chapter8;

public class weather {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[][][] data = new double[10][24][2];
        for(int i = 0; i<240; i++)
        {
            System.out.println("enter the day: ");
            int day = input.nextInt();
            System.out.println("enter the hour:");
            int hour = input.nextInt();
            System.out.println("enter the temprature");
            data[day-1][hour-1][0] = input.nextDouble();
            System.out.println("enter the humity");
            data[day-1][hour-1][1] = input.nextDouble();
        }
        
        for(int day = 0; day<10; day++)
        {
            double SumOfTemp = 0, SumOfHumid = 0;
            for(int hour = 0; hour<24; hour++)
            {
                SumOfTemp += data[day][hour][0];
                SumOfHumid += data[day][hour][1];
            }
            System.out.println("day"+day+"'s average temprature is: "+ SumOfTemp/24);
            System.out.println("day"+day+"'s average humidity is: "+ SumOfHumid/24);
        }
        
    }
}
