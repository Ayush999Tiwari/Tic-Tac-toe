public class Sum_array {
    public static void main(String[]args) {
        int[] arr = {12, 34, 56, 78, 90};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
