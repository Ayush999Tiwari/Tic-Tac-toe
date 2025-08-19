public class Loop_array {
    public static void main(String[]args){
        int [] marks = {90,89,68,47,78};
        /*for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }*/
        //printing array in transverse array
        for(int i = marks.length-1; i>=0; i--){
            System.out.print(marks[i]);
        }
    }
}
