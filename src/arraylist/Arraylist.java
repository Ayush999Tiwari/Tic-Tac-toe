package arraylist;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(0);
        list.add(3);
        list.add(2);
        System.out.println(list);

        // get element
        int element = list.get(0);
        System.out.println(list);

        //add element in between
        list.add(0,5);
        System.out.println(list);

        //set element
        list.set(1,4);
        System.out.println(list);

        // delete element
        list.remove(2);
        System.out.println(list);

        // counting the size of arraylist
        int size = list.size();
        System.out.println(list);

        //loops
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }

}
