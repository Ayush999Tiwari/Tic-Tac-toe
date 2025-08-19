public class Array4 {
    public static void main(String[]args) {
        int[] arr = {12, 34, 56,184, 78, 4};  // finding max and min value in array
        System.out.println(max(arr));
    }
    static int max(int[]arr){
        int maxval = arr[0];

        for(int i=1; i <=arr.length-1; i++){
            if(arr[i]>maxval){
                maxval     = arr[i];
            }
            else{
                return maxval;
            }
        }
                                                                                                                                                      return maxval;
    }


}
