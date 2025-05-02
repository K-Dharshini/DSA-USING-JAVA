import java.util.*;
public class error_rate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double l = 0;
        double r = num;
        double mid = 0;
        while (l<=r)
        {
            mid = l + (r-l)/2;
            if ((double)mid*mid*mid <= num) l=mid+0.00001;
            else r = mid-0.00001;
        }
        System.out.println(r);    
    }
}