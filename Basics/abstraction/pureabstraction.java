package Basics.abstraction;

interface Animal{
void walk();

}


class Horse implements Animal{
    public void walk(){
        System.out.println("Horse is walking");
    } 
}
public class pureabstraction {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
    }
}
