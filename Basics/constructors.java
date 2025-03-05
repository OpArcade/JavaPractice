package Basics;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
// non-parameterized constructor
    // Student(){
    //     System.out.println("Constructor called");
    // }

// parameterized constructor
// Student(String name , int age){
// this.name = name;
// this.age = age;
// }

// copy constructor
Student (Student s2){
    this.name = s2.name;
    this.age = s2.age;
}

Student(){
    
}
}

public class constructors {
    
    public static void main(String args[]){
        Student s1 = new Student(); //Student() is a constructor which make a object of Student class
        //using non-parameterized constructor
        s1.name = "ashish";
        s1.age = 21;


Student s2 = new Student(s1); // copy constructor
        s2.printInfo();

        
    }
}
