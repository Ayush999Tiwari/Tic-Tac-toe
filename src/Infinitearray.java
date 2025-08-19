public class Infinitearray {
    public static void main(String[] args) {

    }
    static int srch(int[] arr , int target){
        int start = 0;              // here is infinite array so we dont know the end of array so we dont use the arr.length function as this function is use d in the finite array
        int end = 1;                 // in this case we choose first two element for finding the target then next 4 elements then next 8 elements untill the target has been found
        while(target>= arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarysrch(arr,target,start,end);
    }
    static int binarysrch(int[]arr, int target, int start, int end) {
        while(end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
