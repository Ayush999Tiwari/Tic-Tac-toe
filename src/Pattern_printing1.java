import java.util.Scanner;

public class Pattern_printing1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        /* *       / ****
           **     /  ***
           ***   /   **
           **** /    *
         */
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){ // printing of row
            for(int j=i; j>=1; j--){  //printing of coloumn
                System.out.print("*");
            }
            System.out.println();  // this is for adding new line after every row
        }
    }
}
