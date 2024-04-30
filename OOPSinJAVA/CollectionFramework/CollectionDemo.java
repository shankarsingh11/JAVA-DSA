package OOPSinJAVA.CollectionFramework;

import java.util.ArrayList;
import java.util.Vector;

public class CollectionDemo {


    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();
        ArrayList<Integer> numlist = new ArrayList<>();
        Vector list1 = new Vector();

        list.add("Shankar");
        list.add((90.93));
        list.add(30);
        list.add(40);

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        numlist.add(37);
        numlist.add(29);
        numlist.add(32);
        numlist.add(10);

        System.out.println(numlist);
        System.out.println(list);

    }
}
