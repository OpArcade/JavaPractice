package Interface;

@FunctionalInterface
interface A{
    void Method();
}

public class functional {
    public static void main(String[] args) {
        A obj = () -> System.out.println("Lambda expression");
        obj.Method();
    }
}
