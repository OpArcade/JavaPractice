package Basics;

// This class contains the method with the while loop.
class LoopWhile {
    public void loopWhile(int a) {
        while (a < 10) {
            a++;
            System.out.println("The number is " + a);
        }
    }
}

// This is the main class that calls the loopWhile function.
public class loop {
    public static void main(String[] args) {
        int n = 0;
        LoopWhile loopObj = new LoopWhile(); // Create an instance of LoopWhile class
        loopObj.loopWhile(n); // Call the method in the LoopWhile class
    }
}
