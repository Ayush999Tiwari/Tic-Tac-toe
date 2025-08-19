import java.util.Scanner;

public class Practice_set4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter the marks of subject1: ");
        int a = sc.nextInt();
        System.out.println("Enter the marks of subject2: ");
        int b = sc.nextInt();
        System.out.println("Enter the marks of subject3: ");
        int c = sc.nextInt();
        int totalmarks = a+b+c;
        int totalpercentage= totalmarks/3;
        int subject1percentage=(a/100)*300;
        int subject2percentage=(b/100)*300;
        int subject3percentage=(c/100)*300;
        if(totalpercentage>=40) {
            System.out.println("student is pass");
        }
        else if(subject1percentage>=33){
            System.out.println("student is pass");
        }
        else if(subject2percentage>=33){
            System.out.println("student is pass");
        }
        else if(subject3percentage>=33){
            System.out.println("student is pass");
        }
        else{
            System.out.println("Student is fail");*/
        //qeustion3
        System.out.println("Enter the income: ");
        int x = sc.nextInt();
        int y = x*(5/100);
        int z = x * (20 / 100);
        int a = x*(30/100);
        if(x>=250000 || x<=500000){
            System.out.println(y);
        }
        else if(x>=500000 || x<=1000000) {
            System.out.println(z);
        }
        else{

            System.out.println(a);
        }
    }

}
