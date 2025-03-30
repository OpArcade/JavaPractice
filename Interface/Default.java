package Interface;

interface DefaultInterface{
    void method(); // abstract method

    default void method2(){ // default method
        System.out.println("Default method from interface itself");
    }
}

class DefaultClass implements DefaultInterface{
    public void method(){
        System.out.println("Abstract method calling from DeafultClass");
    }
}
public class Default {
public static void main(String[] args) {
    DefaultClass obj = new DefaultClass();
    obj.method();
    obj.method2();
}
}