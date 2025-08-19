import java.util.Arrays;

public class Quick_sort {
    public static int divide(int[] arr, int left, int right){
        // firstly we have to define a pivot element
        int pivot=arr[right];
        int i=left-1;
        for(int j=0; j<arr.length; j++){
            if(arr[j]>pivot){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp= arr[i];
        arr[i]=pivot;
        pivot=arr[right];
        return i;
    }
    public static void quicksort(int[]arr, int left,int right){
          if(left<right){int pidx=divide(arr,left,right);
              quicksort(arr, left,pidx-1);
              quicksort(arr,pidx+1,right);
          }
    }
    public static void main(String[] args) {
        int[]arr={23,21,5,8,2,98};
        quicksort(arr,0,arr.length-1);
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
