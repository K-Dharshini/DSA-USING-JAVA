package Recursion.Fibonacci.Series;
public class fibo_series 
{
    public static void main(String[] args) 
    {
        int n = 6;
        fibSeries(n, 0, 1);           
    }

    public static int fibSeries(int n, int a, int b)
    {
        if (n<0) return 0;

        System.out.println(a);
        return fibSeries(n-1, b, a+b);
    }  
}