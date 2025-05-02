package Trailing_Zeros.NoOF5s;
import java.util.*;
public class NoOf0s 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = 1;
        int base = 5;
        int ans = 0;
        int result = 0;
        // while ((Math.pow(base,power)) < num)
        // {
        //     result = num/(int)Math.pow(base,power);
        //     ans += result;
        //     power+=1; 
        // }

        for (power = 1; Math.pow(base,power) < num; power++)
        {
            result = num/(int)Math.pow(base,power);
            ans += result;
        }
        System.out.println("Number of trailing zeros:"+ans);
        sc.close();
    }
}
