import java.util.*;
public class trailingZeros
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        for (int i=1; i<=num; i++)
        {
            fact*=i;
        }
        System.out.println("Factorial:"+fact);

        int cnt =0;
        int dig=0;
        while (fact>0)
        {
            dig = fact%10;
            if (dig == 0) cnt+=1;
            else break;
            fact=fact/10;
        }
        System.out.println("Number of trailing zeros:"+cnt);
        sc.close();
    }
}