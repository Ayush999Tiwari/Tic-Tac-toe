import java.util.Scanner;

public class CWH_taking_input {
    public static void main(String[]args){
        System.out.println("Taking input from user: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int a = sc.nextInt();
        System.out.println("Enter the number2: ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Thw sum of number is: ");
        System.out.println(c);
    }
}
