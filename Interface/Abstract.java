package Interface;

abstract    class car{

    abstract void sound();
    void wheel(){
        System.out.println("4 wheels");
    }
}

class audi extends car{
    void sound(){
        System.out.println("Audi sound");
    }
}

public class Abstract {
    public static void main(String[] args) {
        audi obj = new audi();
        obj.sound();
        obj.wheel();
    }
}
