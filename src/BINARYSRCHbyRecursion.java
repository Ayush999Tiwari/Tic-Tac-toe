public class BINARYSRCHbyRecursion {
    public static void main(String[] args) {
        int arr[] = {12, 34, 23, 65, 785, 46, 40, 98};
        int target = 1;
        System.out.println(search(arr, target, 0, arr.length - 1));

    }

    static int search(int[] arr, int target, int s, int e) {
        int m = s + (e - s) / 2;
        if (s > e) {
            return -1;
        }
        if (arr[m] == target) {
            return m;
        }
        if (arr[m] > target) {
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    }
}