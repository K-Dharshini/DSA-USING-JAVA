import java.util.*;
public class Zeros 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        while (num>0)
        {
            cnt += num/5;
            num = num/5;
        }
        System.out.println(cnt);
        sc.close();
    }
}
