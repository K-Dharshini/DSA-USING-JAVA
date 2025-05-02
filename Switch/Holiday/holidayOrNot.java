package Switch.Holiday;
import java.util.*;
public class holidayOrNot 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day)
        {
            case 1,7:
                System.out.println("Holiday! :D");
                break;
                
            case 2,3,4,5,6:
                System.out.println("Sorry! Not a holiday :(");   
                break;
                
            default:
                System.out.println("Oops! Enter a valid number");

        }
    }
    
}
