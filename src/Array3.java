import java.util.Arrays;

public class Array3 {
    public static void main(String[]args){   // to insert an element (specific position) into an array.
        int[] arr = {12,34,56,78,90};

        System.out.println("Original array "+ Arrays.toString(arr));
        for(int i=2; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[2]=5;
        System.out.println("New array "+Arrays.toString(arr));
    }
}
