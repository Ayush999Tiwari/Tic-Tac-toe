public class Bit_manipulation2 { // finding the non repeted element in array
    public static void main(String[] args) {
        int [] arr = {2,3,2,3,4,4,5};
        System.out.println(ans(arr));
    }
    public static int ans(int []arr) {
        int unique = 0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
