import java.util.*;

public class String_Method {
    public static void main(String[]args){
        String name = "Ayush Tiwari A Psychopath" ;
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('h'));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name);
    }

}
class ashsh {
    public static void main(String[] args) {
        int[] arr = {2,4,6,3,7,4,74,7,5,7,4,6,5,6,5,5,6,5,4,6};
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        // so now sorting the list here
        Collections.sort(list);
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            int i = listIterator.next();
            System.out.println(i);
        }
    }
}
