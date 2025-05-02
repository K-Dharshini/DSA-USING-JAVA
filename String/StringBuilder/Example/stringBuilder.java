package String.StringBuilder.Example;
public class stringBuilder 
{
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Numbers are: ");
        for (int i=1; i<11; i++) sb.append(" "+i);

        System.out.println(sb);

        StringBuilder name = new StringBuilder("Suresh");
        System.out.println("Capacity: "+name.capacity());  // Buffer, memory for computation - 16 bits     
    } 
}