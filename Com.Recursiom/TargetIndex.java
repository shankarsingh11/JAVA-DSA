package Com.Recursiom;

import OOPSinJAVA.ArrayList_Make;

import java.util.ArrayList;

public class TargetIndex {
    public static void main(String[] args) {
        int [] arr = {2,3,1,4,4,5,6};
        System.out.println(findAllIndex(arr,4,0,new ArrayList<>()));
    }

    public  static ArrayList<Integer> findAllIndex(int[] arr, int target, int index , ArrayList<Integer> list) {
                if (index == arr.length) return  list;

                if (target == arr[index]) list.add(index);
                findAllIndex(arr,target,index+1,list);
                return list;
    }
    public  static  ArrayList<Integer> findAllIndex2(int[] arr ,int target,int index){
        ArrayList<Integer> list = new ArrayList<>(5);
        if (index == arr.length) return list;
        if (target == arr[index]) list.add(index);
        ArrayList<Integer> ansfromBelowCalls = findAllIndex2(arr,target,index+1);
        list.addAll(ansfromBelowCalls);
        return list;
    }
}
