public class Bit_Manipulaton3 { // No of digits in binary form in any number
   public static void main(String[] args) {
        int n  = 34567;
        int b = 10;
        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }

}
