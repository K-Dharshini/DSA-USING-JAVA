package BMI.ClassDemo1;

import BMI.ClassDemo.ClassDemo;

public class ClassDemo1 
{
    public static void main(String[] args) 
    {
        ClassDemo classdemo = new ClassDemo();
        int result = classdemo.bmi();
        System.out.println("The BMI is "+result);       
    }   
}