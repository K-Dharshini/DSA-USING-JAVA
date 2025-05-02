public class number 
{
    public static void main(String[] args) 
    {

        // Looping

        // for (int i=1; i<101; i++)
        // {
        //     System.out.println(i);
        // }  
        
        print(1);
    }   
    
    // Recursion
    public static int print(int i)
    {
        if (i > 100)
        {
            return 0;
        }
        System.out.println(i);
        return print(i+1);
    }
}
