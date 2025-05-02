package Recursion.Factorial;
public class factorial 
{
    public static void main(String[] args) 
    {
        int n = 5;
        System.out.println(fact(n));
        
    }
    
    public static int fact(int num)
    {
        if (num == 0) 
        {
            return 1;
        }

        return num * fact(num-1);
    }
}
