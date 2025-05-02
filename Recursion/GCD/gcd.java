package Recursion.GCD;
public class gcd 
{
    public static void main(String[] args) 
    {
        int num1 = 18;
        int num2 = 48;
        System.out.println(GCD(num1,num2));
    }
    
    public static int GCD(int num1, int num2)
    {
        if (num2==0) return num1;
        return GCD(num2, num1%num2);
    }
}
