package Basics.abstraction;



abstract class Animal{
    abstract public void walk();
}


class Horse extends Animal{
    public void walk(){
        System.out.println("Horse is walking");
    }
}

class Dog extends Animal{
    public void walk(){
        System.out.println("Dog is walking");
    }
}
public class first {

    public static void main(String args[]){

    Horse horse = new Horse();
    Dog dog = new Dog();
    dog.walk();
    horse.walk();
    }
}
