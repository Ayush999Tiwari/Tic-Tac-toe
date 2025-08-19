import java.util.Arrays;

public class swapping_Array {
    public static void main(String[]args){
        int[] arr= {1, 3, 23, 9, 28};
        swap(arr,1,3);


        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int index1, int index3){  // swapping of array
        int temp= arr[index1];
        arr[index1]=arr[index3];
        arr[index3]=temp;



    }
}