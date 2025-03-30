package Interface;

interface StaticInterface {
    static void method(){
        System.out.println("static method from interface");
    }
}

public class Static {
    public static void main(String[] args) {
        StaticInterface.method();
    }
}
