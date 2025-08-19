public class Q33_Exam {
    public static void NumberIsOdd(int integer){
        if(integer/2==0){
            throw new ArithmeticException("Integer is odd");
        }
        else{
            System.out.println("Integer is even");
        }

    }
    public static void main(String args[]) {
        //calling the function
        NumberIsOdd(5);
        System.out.println("rest of the code");
    }
}
