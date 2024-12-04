package encapsulation;

class Movie{
    private int duration;

    public void setduration(int newduration){
        duration= newduration;
    }

    public int getduration(){
        return duration;
    }

 }


 
public class Swap {
    public static void swap(Movie a1, Movie a2)
 {
    Movie a3 = new Movie();
    a3.setduration(a1.getduration());

    a1.setduration(a2.getduration());
    a2.setduration(a3.getduration());
 }
    public static void main(String[] args){
        Movie a1  = new Movie();
        a1.setduration(120);

        Movie a2 = new Movie();
        a2.setduration(150);

        System.out.println("Private duration set of a1 is:" + a1.getduration() + "and for a2 is:" + a2.getduration());

        System.out.println("After swaping:-");

        swap(a1,a2);

        System.out.println("for a1 is:" + a1.getduration());

        System.out.println("for a2 is:" + a2.getduration());
    }
}
