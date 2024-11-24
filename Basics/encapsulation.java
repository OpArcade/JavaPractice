package Basics;


class Movie{
    private int duration;
    private String Name;

// setors function -- no return type -- help to access the private data
    // function of access the private duration class in-directly
    public void setDuration(int newDuration){
        duration = newDuration;
    }

    // function of access the private duration class in-directly
    public void setName(String newName){
        Name = newName;
    }

    // geter function -- help to access the values 
    public int getDuration(){
        return duration;
    }
    public String getName(){
        return Name;
    }
}
public class encapsulation {
    public static void main(String[] args){
        Movie objofMovie = new Movie();
        objofMovie.setDuration(120); //giving the duration to the private 
        objofMovie.setName("Loki"); //giving the duration to the private 

        System.out.println("the name of movis is " + objofMovie.getName() + " and the duration is " + objofMovie.getDuration() + "sec.");

    }
}
