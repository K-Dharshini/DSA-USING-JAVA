package Unique;
import java.util.Scanner;
import java.util.Stack;
public class unique 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size+1];
        Stack<Integer> dup = new Stack<>();
        Stack<Integer> unique = new Stack<>();
        for (int i = 0; i<size; i++) array[i] = sc.nextInt();
        for (int i = 0; i<size; i++)
        {
            int c = 0;
            for (int j = 0; j<size; j++)
            {
                if (array[i] == array[j]) 
                {
                    c++;
                }   
            }
            if (c == 1) unique.push(array[i]);
            else if (c>1) dup.push(array[i]);
        }
        System.out.println(dup);
        System.out.println(unique);
    }
}