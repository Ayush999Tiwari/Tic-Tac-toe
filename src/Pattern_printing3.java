public class Pattern_printing3 {
    public static void main(String[]args){
        for(int i = 1; i<=5; i++){  // printing os row
            for(int j = 1; j<=i; j++){ // pritng of coloun as no of row is equals to colomn
                System.out.print(j);
            }
            System.out.println();
        }  /*    1
                 12
                 123
                 1234
                 12345   */

    }
}