package Basics.encapsulation;
import java.util.*;


class Movie{
    int duration= 100;
    String name="Ram";
ArrayList<String> lang = new ArrayList<>();
 
Movie(){}

    Movie(Movie other){
        duration = other.duration;
        name = other.name;


        // if we directly copy the ArrayList in the other new object without creating new ArrayList than the changes in one will reflect in other too;
        // lang = other.lang;  

        // if we create a new object for ArrayList then we can use loop
        lang = new ArrayList<>();
        for(String langs:other.lang){
            lang.add(langs);
        }
    }
}

public class deepcopy {
public static void main(String[] args) {

    Movie firstMovie = new Movie();
    firstMovie.lang.add("english");
    System.out.println(firstMovie.duration + " " + firstMovie.name + " " + firstMovie.lang);

    Movie deepcopyMovie = new Movie(firstMovie);
    deepcopyMovie.lang.add("hindi");
    deepcopyMovie.duration=120;
    System.out.println(deepcopyMovie.duration + " " + deepcopyMovie.name + " " + deepcopyMovie.lang);
}


}
