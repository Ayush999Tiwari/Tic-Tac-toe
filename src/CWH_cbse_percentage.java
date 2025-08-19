import java.util.Scanner;

public class CWH_cbse_percentage {
    public static void main(String[]args){
        System.out.println("Taking inout from user: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject1: ");
        float subject1 = sc.nextInt();
        System.out.println("Enter the marks of subject2: ");
        float subject2 = sc.nextInt();
        System.out.println("Enter the marks of subject3: ");
        float subject3 = sc.nextInt();
        System.out.println("Enter the marks of subject4: ");
        float subject4 = sc.nextInt();
        System.out.println("Enter the marks of subject5: ");
        float subject5 = sc.nextInt();
        float netpercentage= (subject1+subject2+subject3+subject4+subject5)/5;
        System.out.println("Percentage of student is: ");
        System.out.println(netpercentage);

    }
}
