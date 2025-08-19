import java.util.Arrays;

public class arraysss {
    public static void main(String[] args) {
        int arr[]={-88,2,5, 8,8,9,999999999};
        System.out.println(Arrays.stream(arr).max().getAsInt());
        System.out.println(Arrays.stream(arr).min().getAsInt());
    }
}
