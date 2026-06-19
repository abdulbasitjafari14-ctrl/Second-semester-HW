package chapter8;
import  java.util.*;
public class Sudoku {
    public static void main(String[] args){
        
        int[][] grid = getGrid();
        
        
        System.out.println(isValid(grid) ? " valid" : " invalid");
        
    }
    
public static int[][] getGrid()
{
    Scanner input = new Scanner(System.in);
    System.out.print("enter a sudoku solution: ");
    int[][] grid = new int[9][9];
    for(int i = 0; i<grid.length; i++)
        for(int j = 0; j<grid[i].length; j++)
            grid[i][j] = input.nextInt();
    return grid;
}

public static boolean isValid(int[][] grid)
{
    for(int i = 0; i<9; i++)
    {
        for(int j = 0; j<9; j++)
        {
         for(int k = 0; k<9; k++)
                for(int p = 0; p<9; p++)
                    if(grid[k][p] < 1 || grid[k][p] > 9)
                        return false;
        //checking the repeatation in rows
         for(int row = i + 1; row<9; row++)
             if(grid[i][j] == grid[row][j])
                 return false;
         //checking the repeatation in columns
         for(int column = j + 1; column<9; column++)
             if(grid[i][j] == grid[i][column])
                 return false;
         for(int row = (i/3) * 3; row< (i/3) * 3 + 3; row++)
         {
             for(int column = (j/3) * 3; column< (j/3) * 3 + 3; column++)
                 if(grid[i][j] == grid[row][column] && !(row == i && column == j))
                     return false;
         }
        }
    }
    return true;
}
}
