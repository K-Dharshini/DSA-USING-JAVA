public class reverse 
{
    public static void main(String[] args) 
    {
        String s = "I love India";
        System.out.println(rev1(s, "", s.length()-1));  
        System.out.println(rev2(s));  
        System.out.println(rev3(s));
    }

    public static String rev1(String s, String ans, int i)
    {
        if (i < 0)
        {
            return ans;
        }      
        return rev1(s, ans + s.charAt(i), i-1);
    }  

    public static String rev2(String s)
    {
        if (s.length() == 0)
        {
            return "";
        }      
        return s.charAt(s.length()-1) + rev2(s.substring(0, s.length()-1));
    } 

    public static String rev3(String s)
    {
        if ((s.length() == 0) || (s.isEmpty()))
        {
            return "";
        }      
        return rev3(s.substring(1)) + s.charAt(0);
    } 
}