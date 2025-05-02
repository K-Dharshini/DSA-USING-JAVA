package String.Strings.Methods;
public class stringMethods
{
    public static void main(String[] args) 
    {
        String name1 = "Walter";
        String name2 = "Yale";
        String name3 = "YALE";
        String name4 = "Xavier Holland";
        
        System.out.println("CharAt " +name1.charAt(4));
        System.out.println("isEmpty "+name1.isEmpty());
        System.out.println("Contains "+name1.contains("W"));
        System.out.println("equalsignorecase "+name2.equalsIgnoreCase(name3));
        System.out.println("Concat "+name1.concat(name2));
        System.out.println("Startswith "+name2.startsWith("Y"));
        System.out.println("Endswith "+name2.endsWith("e"));
        System.out.println("Length "+name1.length());
        System.out.println("Replace "+name1.replace("a", "o"));

        String sub = name4.substring(7);
        System.out.println("Substring "+sub);
        
        String name5 = " Sky is beautiful ";
        String trimmed = name5.trim();
        System.out.println("Trim "+trimmed);
    }
}