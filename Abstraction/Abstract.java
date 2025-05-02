package Abstraction;
public class Abstract 
{
    public static void main(String[] args) 
    {
        Car car = new Car();
        car.complyRegulations();
        car.capacityCheck();
        car.concreteMethod();
    }
    
}

abstract class Vehicle
{
    int vehId;
    String name;

    public abstract void complyRegulations();
    public abstract void capacityCheck();

    public void concreteMethod()
    {
        System.out.println("This is concrete method");
    }
}

class Car extends Vehicle
{
    public void complyRegulations()
    {
        System.out.println("This is complyRegulations method");
    }

    public void capacityCheck()
    {
        System.out.println("This is capacityCheck method");
    }
}