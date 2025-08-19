import java.util.Arrays;

public class soting {
    public static void main(String[] args) {
        int[] arr = {15,32,27,31,80,11,56};
        System.out.println(max_index(arr,arr.length));
        selection(arr);
        insertion(arr);
    }
    public static void selection(int[] arr){
        // in this we take the max element and take it to the last index
        for (int i = 0; i < arr.length; i++) {
            int max = max_index(arr,arr.length-i);
            int last = arr.length-1-i;
            swap(arr,max , last);
        }
        System.out.println(Arrays.toString(arr));
    }
    // insertion sort code so in insertion sort first two elemeent sort then 3 then four
    public static void insertion(int[] arr ){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr , j , j-1);
                }
                else break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr ,int first , int second){
        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int max_index(int[] arr,  int end  ){
        // so it return the max element in the array
        int max  = 0;
        for (int i = 0; i < end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
