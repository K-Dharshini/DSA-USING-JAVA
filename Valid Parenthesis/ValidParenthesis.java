import java.util.*;
public class ValidParenthesis 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i<s.length(); i++)
        {
            Character ch = s.charAt(i); 
            if ((ch == '{') || (ch == '(') || (ch == '[')) st.push(ch);
            else if ((ch == '}') || (ch == ')') || (ch == ']'))
            {
                if ((st.peek() == '{' && ch == '}') || (st.peek() == '(' && ch == ')') || (st.peek() == '[' && ch == ']')) st.pop();
            }
        }
        if (st.isEmpty()) System.out.println("Valid");
        else System.out.println("Not Valid");        
    }
}
