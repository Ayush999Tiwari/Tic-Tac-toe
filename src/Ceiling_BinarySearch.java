public class Ceiling_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,7,12,14,23,25,35,41,47,56};
        int target = 5;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[] arr , int target){  // finding the number which is smallset no. greater than target
        int start = 0;
        int end = arr.length-1;
        while(end >= start){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }


}
