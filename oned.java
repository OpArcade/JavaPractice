package Array;


public class oned {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        
        System.out.println("the length of array is:" + arr.length);
        System.out.println("using for loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
System.out.println();
        System.out.println("using for each loop");
        for (int i : arr){
            System.out.print(i + " ");
        }
        
    }
}

