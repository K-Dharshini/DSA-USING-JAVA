package String.Strings.Example;
public class string 
{
    public static void main(String[] args) 
    {
        String name1 = "Dharshini"; 
        String name2 = "Dharshini"; // both name1 and name2 share the same memory space as the values are same
        
        // SHALLOW SEARCH
        System.out.println(name1 == name2); // returns true as the memory is shared

        String name3 = new String("Dharshini"); // even though the value is same, the new keyword creates a new memory space for name3 and name3 does not have a shared memory with name1 and name2
        
        // SHALLOW SEARCH
        System.out.println(name1 == name3); // returns false as the memory is not shared

        // DEEP SEARCH
        System.out.println(name3.equals(name1)); // returns true as the values are same

        // == operator performs a SHALLOW SEARCH in JVM where the memory address is compared, if values are same but memory is different -> False
        // .equals() performs DEEP SEARCH in JVM where the values are compared, values same memory different
    }    
}
