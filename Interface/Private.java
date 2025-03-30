package Interface;

interface A{
    default void display(){
        CommonMethod();
        System.out.println("A SOP in the default method of interface A");
    }
    private void CommonMethod(){
        System.out.println("Common Method calling from interface A");
    }
}

class B implements A{}

public class Private {
public static void main(String[] args) {
    B obj = new B();
    obj.display();    
}    
}
