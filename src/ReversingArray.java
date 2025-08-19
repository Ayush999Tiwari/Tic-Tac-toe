import java.util.Arrays;

/*public class ReversingArray {
    public static void main(String[]args){
        int arr[]={12,34,56,78,90};
        swap(arr,0,4,1,3);



        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int index0,int index4,int index1,int index3){

        int temp = arr [index0];
        int temp1 = arr [index1];
        arr [index0]=arr[index4];
        arr[index1]=arr[index3];
        arr[index4]=temp;
        arr[index3]=temp1;


    }
}*/public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

