import java.util.Arrays;

public class RemovingElementsInArray {
    public static void main(String[]args){
        int[]arr={1,23,32,21,31,43,35,45,76,78,53};
        System.out.println("Original array: "+ Arrays.toString(arr));
        int removeIndex=2;
        for(int i=removeIndex; i< arr.length-1; i++){
            arr[i]=arr[i+1];                         // always see it
        }
        System.out.println("New array: "+ Arrays.toString(arr));//aaj fir tu aai nahi, yaad teri aai thii, bewajah hi bewafa se bepanah ummid jo lagayi thii
    }
}
