import java.util.*;
public class without 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character>  arr = new HashSet<>();
        int l = 0;
        int maxLength = 0;
        
        for (int r=0; r<s.length(); r++)
        {
            while (arr.contains(s.charAt(r)))
            {
                arr.remove(s.charAt(l));
                l+=1;
            }
            arr.add(s.charAt(r));
            maxLength = Math.max(maxLength, r-l+1);
        }
        System.out.println("Max length is "+maxLength);

    }    
}