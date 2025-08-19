public class Linear_search {
    public static void main(String[] args) {
        int[] arr= {2,4,6,3,6,3,7,4,7,4,7,47,8,4,7,5,75,6,};
        int target  = 47;
        int ans =0;
        // code for the linear search
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
