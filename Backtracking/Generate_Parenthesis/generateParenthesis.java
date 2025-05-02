package Backtracking.Generate_Parenthesis;
import java.util.*;
public class generateParenthesis 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        parenthesis(n, list, "", 0, 0);
        System.out.println(list);
    }

    public static void parenthesis(int n, ArrayList<String> list, String ans, int open, int close)
    {
        if (open==close && ans.length()==2*n) list.add(ans);       

        if (open<n) parenthesis(n, list, ans+'(', open+1, close);

        if (close<open) parenthesis(n, list, ans+')', open, close+1);
    }    
}
