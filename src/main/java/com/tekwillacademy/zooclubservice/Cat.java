package com.tekwillacademy.zooclubservice;

public class Cat extends Animal
{

    public Cat(String name)
    {
        super(name);
    }
    @Override
    public void makeSound()
    {
        System.out.println(this.getName() + "The cat is making like: MEAWWWW!!! ");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "The cat is eating fish");
    }
}
