public class bit_Manipulation4 { // check wheather no. is power of two or not
    public static void main(String[] args) {
        int n = 8;
        System.out.println(ispower(n));
    }
    public static boolean ispower(int n){
        //int count = 0;
        return n > 0 && (n & (n - 1)) == 0;


    }
}
