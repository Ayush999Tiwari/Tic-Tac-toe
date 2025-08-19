import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Prime_No {
    static boolean isPrime(int n) {
//        int x = (int)sqrt(n);

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }


        }
        return true;

    }
    public static void main(String[]args){
        if (isPrime(99)) {
            System.out.println(" true");
        }
        else{
            System.out.println("false");
        }
//        System.out.println(sqrt(457847365));
    }

}



