package Basics.encapsulation;

class calculateArea{
    private int length;
    private int breadth;

// set lenght and breadth
public void setLength(int newLength){
    length = newLength;
}
public void setBreadth(int newBreadth){
    breadth = newBreadth;
}
//  Area(int length , int breadth){
//     this.length = length;
//     this.breadth = breadth;
// }

public int getArea(){
    return this.length * this.breadth;
}


}

public class Area{
    public static void main(String[] args){
        calculateArea a1 = new calculateArea();

        a1.setLength(5);
        a1.setBreadth(6);
        System.out.println("The area is: " + a1.getArea());
    }
}
