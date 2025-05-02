package Root.Nth_Root;
import java.util.*;
public class nth_root 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double root = sc.nextDouble();
        double l = 0;
        double r = num;
        double mid = 0;
        double error = 0.0000001;
        
        while ((r-l) > error)
        {
            mid = l + (r-l)/2;
            if (Multiply(mid,root) > num) r = mid;
            else l = mid;
        }
        System.out.println("The "+root+"root of "+num+" is = "+mid);
    }

    public static double Multiply(double num, double root)
    {
        double mul = 1;
        for (int i = 0; i<root; i++) mul *= num;
        return mul;
    }
}
