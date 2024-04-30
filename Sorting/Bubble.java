package Sorting;

import java.util.Arrays;

public class Bubble {

    public static  void  printArray(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
      public static  void  swap( int [] arr , int j){
           int temp = arr[j];
           arr[j] = arr[j-1];
           arr[j-1] = temp;
       }

      public static  void  bubble(int[] arr){
        boolean swapped;
        // run the steps n-1 times
           for (int i = 0; i < arr.length; i++) {
               swapped = false;
               // for each step , max item will  come at the last respective index
               for (int j = 1; j <= arr.length-i-1; j++){
                   // swap if the smaller than the previous item
                   if (arr[j]<arr[j-1]) {
                       // swap
                       swap(arr,j);
                       swapped= true;
                   }
               }
               // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
               if (!swapped){  // !false = true
                   break;
               }
           }
       }
    public static void main(String[] args) {
        int [] arr = {-1,4,-32,8,89};
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println(Arrays.toString(arr));
       // printArray(arr);
    }
}
