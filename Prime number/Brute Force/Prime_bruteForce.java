import java.util.*;
public class Prime_bruteForce 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrime(n);
        sc.close();
    }
    public static boolean isPrime(int num)
        {
            boolean flag = true;
            for (int i = 2; i<=num/2; i++)
            {
                if (num%i==0)
                {
                    flag = false;
                }

            }
            return flag;
        }

        public static void printPrime(int n)
        {
            for (int i = 2; i<=n; i++)
            {
                if (isPrime(i))
                {
                    System.out.println(i);
                }
            }
        }            
}