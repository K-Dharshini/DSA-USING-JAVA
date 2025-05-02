import java.util.*;
public class NumberWords
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] Ones = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] Teens = {" ","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] Tens = {" "," ", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if (num==10)
        {
            System.out.print("Ten");
            return;
        }

        if (num==100)
        {
            System.out.print("Hundred");
            return;
        } 

        if (num==1000) 
        {
            System.out.print("Thousand");
            return;
        }    

        if (num>10 && num<20)
        {
            System.out.print(Teens[num%10]);
        } 
        
        if (num>1000)
        {
            System.out.print(Ones[num/1000] + " Thousand ");
            num = num%1000;
        }

        if (num>100) 
        {
            System.out.print(Ones[num/100] + " Hundred ");
            num=num%100;
        }

        if (num>=20)
        {
            System.out.print(Tens[num/10]+" ");
            num=num%10;
        }

        if (num<10)
        {
            System.out.print(Ones[num]);
        } 
    }
}