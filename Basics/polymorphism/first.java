// 2 types of polymorphism
// function overloading :- compile time polymorphism
// function overriding :- run time polymorphism

package Basics.polymorphism;

class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name , int age){
        System.out.println(name + " " + age);
    }
}
public class first {
    public static void main (String args[]){
        Student s1 = new Student();
        s1.name="ashish";
        s1.age=21;

        s1.printInfo(s1.age + " " + s1.name);
        
    }
}
