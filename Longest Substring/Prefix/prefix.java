public class prefix 
{
    public static void main(String[] args)
    {
        String[] arr = {"flower", "flow", "target"};
        String prefix = arr[0];

        for (int i=1; i<arr.length; i++)
        {
            while (arr[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0, (prefix.length())-1);
                    
                if (prefix.isEmpty())
                { 
                i = arr.length;
                break;
                }
            }
        }
        System.out.println(prefix); 
    }       
}