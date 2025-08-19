import java.util.Arrays;

public class Sorting_of_Array {
    public static void main(String[]args){
        int[] arr= {
                1234,1343,1637,6327,
                2633,1323,1573,1863,
                1432,1234,1246
        };
        String[] arr_2 = {
                "C",
                "C#",
                "C++",
                "Python",
                "Java",
                "C programming"

        };
        System.out.println("Original array" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array " + Arrays.toString(arr));
        System.out.println("Original array"+ Arrays.toString(arr_2));
        Arrays.sort(arr_2);
        System.out.println("sorted array "+ Arrays.toString(arr_2));

    }
}
