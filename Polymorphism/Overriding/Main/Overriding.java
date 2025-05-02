package Polymorphism.Overriding.Main;
import Polymorphism.Overriding.Cat.Cat;
import Polymorphism.Overriding.Cow.Cow;
import Polymorphism.Overriding.Dog.Dog;

public class Overriding 
{
    public static void main(String[] args) 
    {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        cat.parentMakeSound();
        cat.makeSound();      
        dog.makeSound();
        cow.makeSound();    
    }    
}