public class Bit_Manipulation1 { // finding the odd no.out
    public static void main(String[] args) {
        int n = 67;
        System.out.println(isodd(n));
    }
    public static boolean isodd(int n){
          return(n & 1) == 1;
    }
}
//last page dsa content copy
