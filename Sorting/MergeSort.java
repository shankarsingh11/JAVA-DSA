package Sorting;
import java.util.Arrays;
public class MergeSort {
    public  static  int[] mergesort(int[] arr) {

        if (arr.length == 1) return arr;

        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
        private static  int[] merge(int[] first,int[] second){
            int[] mix = new int[first.length + second.length];
            int i = 0;
            int j = 0;
            int k = 0;
            while (i< first.length && j< second.length){
                if (first[i]<second[j]){
                    mix[k++] = first[i++];
                }else {
                    mix[k++] = second[j++];
                }
            }
            // it may be possible that one of the arrays is not complete

            while(i< first.length){
                mix[k++] = first[i++];
            }
            while (j< second.length){
                mix[k++] = second[j++];
            }
            return mix;
        }

    public static void main(String[] args) {
        int [] arr = {5,4,-1,2,1,-3,0};
        int[] ans = mergesort(arr);
        System.out.println(Arrays.toString(arr));
        // create a new array after calling a mergesort function not change  original array
        System.out.println(Arrays.toString(ans));
    }
}
