package Recursion.Permutation;
import java.util.*;

public class Permutation
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>();    
        permutation("abc", "", list);   
        System.out.println(list);         
    }   

    public static void permutation(String str, String ans, ArrayList<String> list)
    {
        if (str.isEmpty()) list.add(ans);

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            String res = str.substring(0, i) + str.substring(i+1);
            permutation(res, ans+ch, list);
        }
    }
}