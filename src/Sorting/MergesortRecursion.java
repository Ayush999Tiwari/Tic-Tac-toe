package Sorting;

import java.util.Arrays;

public class MergesortRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int [] mergesort(int [] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = mergesort(Arrays.copyOfRange(arr,0,mid)); // copyofrange is a function which copy elements of a specified array into a new array
        int [] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);
    }
    private static int [] merge(int []first, int []second){
        int [] mix = new int[first.length+ second.length];
         int k=0;
         int j = 0;
         int i =0;
         while(i<first.length && j< second.length){
             if(first[i]<second[j]){
                 mix[k]=first[i];
                 i++;
             }
             else {
                 mix[k]=second[j];
                 j++;
             }
             k++;
         }
         while(i<first.length){
             mix[k]=first[i];
             i++;
             k++;
         }
        while(j<second.length){
            mix[k]=first[i];
            j++;
            k++;
        }
        return mix;
    }
}
