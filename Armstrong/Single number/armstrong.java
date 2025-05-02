

import java.util.Scanner;
public class armstrong 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int dig = 0;
    int sum = 0;
    int temp = num;
    int leng = (int)(Math.log10(num) + 1);
    while (temp!=0)
    {
        dig = temp%10;
        sum+=Math.pow(dig,leng);
        temp=temp/10;
    }
    if (num == sum) System.out.println("Armstrong Number");
    else System.out.println("Not an Armstrong Number");
    sc.close();
    }
}
