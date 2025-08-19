public class average_value_array {
    public static void main(String[]args){  //printing average value of array elements
        int[]arr={1,2,3,4,5,6,7,8,9};
        int sum = 0, avg;
        for(int i: arr){
            sum+=i;
        }
        avg=sum/9;
        System.out.println("Average value of array is"+ avg);
    }
}
