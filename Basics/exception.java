package Basics;



class Myexception extends Exception{
  int a;
  Myexception(int b){
    a=b;
  }
  public String toString(){
    return "Exception number: "+a;
  }
}

public class exception{
    public static void main(String[] args){
        String str= null;
        // System.out.println(str.length());

        try{
            throw new Myexception(5);
        }catch(Exception e){
            System.out.println(e);
        }

        // try {
        //     int a=10 , b=0;
        //     int c=a/b;
        //     System.out.println(" result:-" + c);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Can't divide the number by the zero" );
        // }

        // try{
        //     int a= Integer.parseInt("100");
        //     System.out.println(" result:-" + a);
        // }catch(NumberFormatException e){
        //     System.out.println("Can't convert the string to the number");
        // }
        // try{
        //     int a[] = new int[5];
        //     a[7]=9;
        // }catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Array index out of bound");
        // }
        // finally{
        //     System.out.println("Finally block is always executed");
        // }
    }
}