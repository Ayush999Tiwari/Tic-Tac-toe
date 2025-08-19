import java.util.Arrays;
import java.util.Scanner;

public class Array_2 {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        int[] arr = new int[5];
        arr [0]= 23;
        arr[1]= 67;
        arr [2]= 78;
        arr [3]= 43;
        arr [4] = 51;
        // [23,67,78,43,51];
       // System.out.println(arr[3]);
        String[] str = new String[4];
        for(int i =0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
