package Polymorphism.Overriding.Cat;
import Polymorphism.Overriding.Animal.Animal;

public class Cat extends Animal
{
    public void parentMakeSound()
    {
        super.makeSound();
    }

    public void makeSound()
    {
        System.out.println("CAT : Meow");
    }
}