public class Q34_Exam {

        //function to check if person is eligible to vote or not
        public static void Underageforvoting(int age) {
            if(age<18) {
                //throw Arithmetic exception if not eligible to vote
                throw new ArithmeticException("Person is not eligible to vote");
            }
            else {
                System.out.println("Person is eligible to vote!!");
            }
        }
        //main method
        public static void main(String args[]){
            //calling the function
            Underageforvoting(13);
            System.out.println("rest of code");
        }

}
