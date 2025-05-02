package Switch.Calculator;
import java.util.*;
public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int choice = 0;

        while (choice!=5)
        {
            System.out.println("\nThis is a Menu Driven Calculator Program");
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            System.out.println("Enter 5 to Exit\n");

            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    Sum(num1,num2);
                    break;

                case 2:
                    Difference(num1, num2); 
                    break; 
                    
                case 3:
                    Product(num1, num2);
                    break;

                case 4:
                    Division(num1, num2);    
                    break;
                    
                case 5:
                    System.out.println("Exiting..");
                    break;    
            
                default:
                    System.out.println("Enter a valid choice (1-5)");
            }
        }   
    }

    public static void Sum(int num1, int num2)
    {
        int add = num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is: "+add);
    }

    public static void Difference(int num1, int num2)
    {
        int diff = num1-num2;
        System.out.println("The difference of "+num1+" and "+num2+" is: "+diff);
    }

    public static void Product(int num1, int num2)
    {
        int prod = num1*num2;
        System.out.println("The multiplication of "+num1+" and "+num2+" is: "+prod);
    }

    public static void Division(int num1, int num2)
    {
        if (num2 == 0) System.out.println("Zero Division Error");
        else
        {
        int div = num1/num2;
        System.out.println("The division of "+num1+" and "+num2+" is: "+div);
        }
    }   
}