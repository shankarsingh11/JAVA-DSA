package Sorting;

public class Selection {
    public static  void  printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static  void  swap( int [] arr , int j){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }

    public  static  void  selection(int[] arr){

        int maxElement = arr[0];
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (maxElement < arr[j]) {
                      maxElement = arr[j];
                }
            }
        }
    }


    public static void main(String[] args) {

    }
}
