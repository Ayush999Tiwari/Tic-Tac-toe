public class Floor_binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,7,12,14,23,25,35,41,47};
        int target = 26;
        System.out.println(floor(arr,target));
    }

    static int floor(int []arr, int target){  // floor number is the number which is greatest no smaller than the target.
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
        return end;


    }
}
