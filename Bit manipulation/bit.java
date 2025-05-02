public class bit 
{
    public static void main(String[] args) 
    {
        int num1 = 7;
        int num2 = 11;
        int num3 = 64;

        System.out.println("Bit-wise AND "+ (num1 & num2));
        System.out.println("Bit-wise OR "+ (num1 | num2));
        System.out.println("Bit-wise NOT "+ (~num2));
        System.out.println("Bit-wise XOR "+(num1^num2));

        // Even or odd - &
        if ((num1 & 1) == 1)
        {
            System.out.println("Odd"); // odd -> 1
        }

        else System.out.println("Even"); // even -> 0

        // Power of 2 or not
        if ((num3 & (num3 - 1)) == 0) System.out.println(num3+" is a power of 2");
        else System.out.println(num3+" is not a power of 2");

        // complement of a number
        int len = Integer.toBinaryString(num2).length(); 
        int mask = (1<<len)-1;
        System.out.println("Complement "+(mask ^ num2));

        // reverse bits
        int bin_num = 10;
        int last = 0;
        int ans = 0;
        for (int i = 0; i<4; i++)
        {
            last = bin_num & 1; // to get the last digit of the number -> get - and with 1
            ans <<= 1; // to shift the ans variable to make space for the last bit to occupy
            ans |= last; // the last bit is stored in the ans -> set 1 - or with 0 (set 0 - and with 0)
            bin_num >>= 1; // to remove the last bit after it has been stored in the ans
        }
        System.out.println("Decimal format of reverse "+ans);
        System.out.print("Binary format of reverse ");
        System.out.println(Integer.toBinaryString(ans));

        //Swapping of variables without using third variable
        int a = 2;
        int b = 6;

        System.out.println("Before Swapping "+a+" "+b);

        a = a^b; // a = a+b
        b = a^b; // b = a-b
        a = a^b; // a = a-b

        System.out.println("After Swapping "+a+" "+b);

        // Number of ones in a binary number (Hamming weights)
        int bin = 29;
        int end = 0;
        int res = 0;
        int leng = Integer.toBinaryString(bin).length();

        for (int i=0; i<leng; i++)
        {
            end = bin & 1;
            if (end==1) res+=1;
            bin >>= 1;
        }

        System.out.println("Number of ones "+res);

        // Hamming distance
        int n1 = 12;
        int n2 = 11;

        int xor = n1^n2;
        int l = 0;

        int length = Integer.toBinaryString(xor).length();
        int hammingDistance = 0;

        for (int i = 0; i < length; i++)
        {
            l = xor & 1;
            if (l==1) hammingDistance+=1;
            xor >>= 1;
        }
        
        System.out.println("Hamming Distance "+hammingDistance);

        // Find the anomaly in the string

        String str1 = "India";
        String str2 = "InWdia";

        int index = 0;
        char c = ' ';

        int flag = 0;

        for (int i=0; i<str1.length(); i++)
        {
            if ((str1.charAt(i) ^ str2.charAt(i)) != 0) 
            {
                flag = 1;
                index = i;
                c = str2.charAt(i);
                break;            
            }

        }
        
        if (flag == 1)
        {
        System.out.println("Index of mismatched character "+index);
        System.out.println("Mismatched element "+c); 
        }

        else
        {
            c = str2.charAt(str2.length()-1);
            index = str2.length()-1;
            System.out.println("Index of mismatched character "+index);
            System.out.println("Mismatched element "+c);
        }
    } 
}