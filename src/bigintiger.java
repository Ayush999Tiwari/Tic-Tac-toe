import java.math.BigInteger;

public class bigintiger {
    // so this is the code of the big intiger
    public static void main(String[] args) {
       // factorail of the number
        int n = 78111;
        BigInteger mul = BigInteger.valueOf(1);
        for (int i = 2; i <=n ; i++) {
            mul = mul.multiply(BigInteger.valueOf(i));
        }
        System.out.println(mul);

    }
}
