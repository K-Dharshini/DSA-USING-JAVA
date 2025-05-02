import java.util.*;
public class Prime
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int n=sc.nextInt();
    boolean arr[]=new boolean[n+1];
    for(int i=0;i<=n;i++)
    {
        arr[i]=true;
    }
    for(int j=2;j*j<=n;j++)
    {
        if(arr[j]==true)
        {
            int m=j*j;
            while(m<=n)
            {
                arr[m]=false;
                m+=j;
            }
        }
    }
    for (int k=2; k<=n; k++)
    {
        if (arr[k] == true)
        {
            System.out.println(k);
        }
    }
    sc.close();
}
}