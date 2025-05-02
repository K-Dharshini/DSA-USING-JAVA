
import java.util.*;
public class cubeRoot 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int l =0;
        int r = num;
        int mid = 0;
        while (l<=r)
        {
            mid = l + (r-l)/2;
            if (mid*mid*mid <= num) l=mid+1;
            else r = mid-1;
        }
        System.out.println(r);       
    }
}
