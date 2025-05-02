package Armstrong.Range;
import java.util.*;
public class range 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for (int i = 1; i<=range; i++)
        {
            if (Check(i,range)) System.out.println(i);
        }
    }
    public static boolean Check(int i,int range)
    {
    int dig = 0;
    int sum = 0;
    int temp = i;
    boolean flag = true;
    int leng = (int)(Math.log10(i) + 1);
    while (temp!=0)
    {
        dig = temp%10;
        sum+=Math.pow(dig,leng);
        temp=temp/10;
    }
    if (sum == i) flag = true;
    else flag = false;
    return flag;
}
}
