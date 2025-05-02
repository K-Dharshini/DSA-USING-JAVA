public class array_sum 
{
    public static void main(String[] args) 
    {
         int[] n = {3,6,5,4,7,5,9};
         System.out.println(sum(n, 0, 0));        
    }

    public static int sum(int[] n, int i, int s)
    {
       if (i == n.length)
       {
        return s;
       } 

       return sum(n, i+1, s+n[i]);
    }
}