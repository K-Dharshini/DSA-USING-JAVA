package SortedArray;
import java.util.*;
public class sortedArray
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<arr.length; i++) arr[i]=sc.nextInt();

        boolean flag = true;
        for (int i=0; i<arr.length-1; i++)
        {
            if (arr[i]<arr[i+1]) flag = true;
            else 
                {
                flag = false;
                break;
                }
        }
        
        if (flag) System.out.println("The array is sorted!");
        else System.out.println("The array is not sorted :(");
    }   
}