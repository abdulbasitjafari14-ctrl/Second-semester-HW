package lottonumbers;

import java.util.Scanner;

public class LottoNumbers {
   public static void main(String[] args) {
         
       Scanner input = new Scanner(System.in);
                  boolean[] isCovered = new boolean[100];
           System.out.println("enter a 100 num between 1-99 : ");
           int num = input.nextInt();
           while(num != 0)
           {
               if(num >=1 && num <= 99)
               {
                   isCovered[num] = true;
               }
               num = input.nextInt();
           }
           
           boolean allCovered = true;
           for(int i = 1; i<isCovered.length; i++)
           {
               if(isCovered[i] == false)
               {
                   allCovered = false;
                   break;
               }
           }
           
           if(allCovered == true) System.out.println("you have all 1-99 numbers");
           else System.out.println("you dont have all 1-99 numbers");

    }
    
}
