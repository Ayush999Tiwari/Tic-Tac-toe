import java.util.Scanner;

public class Practice_set5 {
    public static void main(String[]args){
        /*int n = 4;
        for(int i=n;i>0;i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }*/
        //qeustion2
       int sum=0;
       // Scanner sc = new Scanner(System.in);
//System.out.print("Enter the number: ");
        //int n = sc.nextInt();
        //while(i<n){

          //  sum = sum + (2*i);
          //  i++;
           // System.out.println(sum);
        //qeustion3
       // for(int i =1; i<=10; i++){
            //System.out.println(n*i);
        //}
        //question4
        //for(int i=10; i>=1; i--){
          //  System.out.println(n*i);
        //}
        //qeustion5
        //int factorial = 1;
       // for(int i=1; i<=n; i++){
          //  factorial *=i;
           // System.out.print("Factorial of "+ n + " is: " + factorial);
        //qeustion9
        int n=8;
        for(int i=1; i<=10; i++) {
            sum += n * i;
        }
            System.out.println(sum);
    }
}