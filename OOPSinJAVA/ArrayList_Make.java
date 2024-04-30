package OOPSinJAVA;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Make {

    public  static  class ArrayList{
        int[] arr = new int[2];
        int idx =0;
        int size = 0;
        public  void add(int element){
            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr,arr.length*2);
//                arr = new int[brr.length];
//                arr = Arrays.copyOf(brr,brr.length);
                arr = brr;
            }
            arr[idx] = element;
            idx++;
            size++;
        }

        public   void set(int idx,int val){
            arr[idx] = val;
        }



    }

    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size);
        arr.add(5);
        System.out.println(arr.size);
        arr.set(0,10);



     // Dynamic Array
//        ArrayList<Integer> arr = new ArrayList<>(4);
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        arr.add(6);
//        arr.set(0,100);
//        System.out.println(arr.size());
//        System.out.println(arr);
//        System.out.println(arr.get(0));

    }
}
