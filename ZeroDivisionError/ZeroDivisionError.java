package ZeroDivisionError;

import java.util.*;
public class ZeroDivisionError
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int div = 0;

        try
        {
            div = num1/num2;
        }

        catch (ArithmeticException exception)
        {
            System.out.println("The divisor cannot be zero!! Please change the num2 value");
        }

        finally
        {
            sc.close();
        }

        System.out.println("The division of "+num1+" and "+num2+" is "+div);
    }    
}
