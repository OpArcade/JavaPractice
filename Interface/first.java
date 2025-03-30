package Interface;


interface animal{
    void sound();
}
class dog implements animal{
    public void sound(){
        System.out.println("Bark");
    }
}
public class first {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.sound();
        
    }
}
