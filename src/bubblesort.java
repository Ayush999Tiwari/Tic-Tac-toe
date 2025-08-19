import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {  // in this sorting we compare adjacent nombers
        int[] arr = {54,93,12,34,1,8,24};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

    }

}
