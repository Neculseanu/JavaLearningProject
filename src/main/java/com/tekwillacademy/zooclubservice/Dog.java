package com.tekwillacademy.zooclubservice;

public class Dog extends Animal
{
   public Dog(String dogName)
   {
       super(dogName);
   }
    @Override
    public void eat() {
        System.out.println(getName()+" The dog is eating bones");
    }

    @Override
    public void makeSound()
    {
        System.out.println("Dog is making like : Mrrrrrr");
    }
}
