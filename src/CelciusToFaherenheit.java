import java.util.Scanner;

public class CelciusToFaherenheit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Temprature in celcius ");
        int a= sc.nextInt();
        float b = (a * 9/5) + 32;
        System.out.println("Temprature in fahrennheit "+ b);
    }
}
