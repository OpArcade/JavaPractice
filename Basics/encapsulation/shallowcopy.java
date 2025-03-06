package Basics.encapsulation;



class Movie{
    int duration = 150;
    String name = "RAM";
    double ratings= 5.0;
}
public class shallowcopy {
    public static void main(String[] args) {
        Movie Hanuman = new Movie();
        System.out.println(Hanuman.name + " " + Hanuman.name + " " + Hanuman.ratings);

        Movie shallowcopyMovie = Hanuman;
        System.out.println(shallowcopyMovie.name + " " + shallowcopyMovie.name + " " + shallowcopyMovie.ratings);
    
System.out.println("after change");
shallowcopyMovie.name = "Shita";
System.out.println(Hanuman.name + " " + Hanuman.name + " " + Hanuman.ratings);

        System.out.println(shallowcopyMovie.name + " " + shallowcopyMovie.name + " " + shallowcopyMovie.ratings);

    }
}
