public class binary_search  {
    public static void main(String[] args) {
        int[] arr ={2,4,7,12,14,23,25,35,41,47};
        int target = 35;
        System.out.println(srch(arr,target));
    }
    static int srch(int[] arr , int target){
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
        return -1;
    }

}
