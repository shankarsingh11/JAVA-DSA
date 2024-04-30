package Sorting;

import java.util.Arrays;

public class MergeSortInPlace {

     public  static void mergesortInplace(int[] arr,int s ,int e){
         if (e-s == 1)return;
         int mid =  (s+e)/2;
         mergesortInplace(arr,s,mid);
         mergesortInplace(arr,mid,e);
         mergeInplace(arr ,s,mid,e);
     }
     private  static  void mergeInplace(int[]arr,int s,int m,int e){
         int [] mix = new int[e-s];
         int i = s;
         int j = m;
         int k = 0;
         while (i<m && j<e){
             if (arr[i]<arr[j]){
                 mix[k++] = arr[i++];
             }else {
                 mix[k++] = arr[j++];
             }
         }
         // copy the remaining elements

         while (i<m){
             mix[k++] = arr[i++];
         }
         while (j<e){
             mix[k++]= arr[j++];
         }

         for (int l = 0; l < mix.length; l++) {
             arr[s+l] =mix[l];
         }

//         System.arraycopy(mix, 0, arr, s + 0, mix.length);
     }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
       mergesortInplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
