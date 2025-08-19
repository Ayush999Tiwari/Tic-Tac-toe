import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first no ");
        int a = in.nextInt();
        System.out.println("Enter the second no ");
        int b = in.nextInt();
        int sum=a+b;
        System.out.println("Sum of integers "+sum);
        int difference=a-b;
        System.out.println("Difference of two integers "+difference);
        int multiplication=a*b;
        System.out.println("Product of two integers "+multiplication);
        int division=a%b;
        System.out.println("Division of two integers "+division);
    }
}
