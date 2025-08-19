public class printing_grid {
    public static void main(String[]args){
        int [] arr = new int[10];
        for(int i =0; i<=9; i++){
            for(int j =0; j<=arr.length-1; j++){
                System.out.print(" _ ");
            }
            System.out.println();
        }
    }
}
