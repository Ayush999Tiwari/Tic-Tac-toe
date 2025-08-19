import java.util.Scanner;

public class do_while_loop {
    public static void main(String[]args){
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        do{
            System.out.println(i);
            i++;
        }
        while(i<=x);
    }
}
