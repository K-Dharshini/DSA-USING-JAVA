package Backtracking.NQueens;
import java.util.*;
public class nqueens {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] queens = new int[n];
        int row=0;
        placeMyQueens(queens, row);
    }
    public static void placeMyQueens(int[] queens,int row)
    {
        if(row>=queens.length)
        {
            System.out.println("---------");
            for (int i = 0; i < queens.length; i++) 
            {
                System.out.println("[ "+i+" , "+queens[ i ]+ " ]");
            }
            return;
        }
        for (int col=0 ; col < queens.length; col++) 
        {
            if(isSafe(queens,row,col))
            {
                queens[row]=col;
                placeMyQueens(queens,row+1);
            }
        }
    }
    public static boolean isSafe(int[] queens,int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            if(queens[i]==col) return false;
            if(i-row==queens[i]-col) return false;
            if(i-row==col-queens[i]) return false;
            
        }
        return true;
    }
}