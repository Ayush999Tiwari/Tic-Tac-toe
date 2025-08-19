public class Main {
    private static int productOfConsecutive(int start, int k) {
        int product = 1;
        for (int i = 0; i < k; i++) {
            product *= (start + i);
        }
        return product;
    }
    public static int f(int n) {
        int sum = 0;
        int start = 1;
        for (int k = 1; k <= n; k++) {
            sum += productOfConsecutive(start, k);
            start += k;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 3;
        int result = f(n);
        System.out.println("f(" + n + ") = " + result);
    }
}



