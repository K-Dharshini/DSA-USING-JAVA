package String.StringBuilder.Methods;
public class StringBuilderMethods 
{
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Happy Birthday");

        sb.append(" Riya!");
        System.out.println("Append "+sb);

        sb.delete(6,11);
        System.out.println("Delete "+sb);

        sb.replace(6,7,"D");
        System.out.println("Replace "+sb);

        sb.reverse();
        System.out.println("Reverse "+sb);

        System.out.println("Length "+sb.length());

        System.out.println("Capacity "+sb.capacity());

        System.out.println("To String "+sb.toString());
    }   
}