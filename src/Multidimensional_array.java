public class Multidimensional_array {
    public static void main(String[]args){
        int arr[][]= {{1,2,3},{2,3,4},{4,5,6}};
        for(int i = 0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
/* in  2d array int arr[3][4] length of array is 3 basically no of rows in array .
int arr[3][2]={1,2,3}
               {4,5}
               {6,7,8,9}
               if we have to address the length of coloumn then we have to calculate length of each row
                
 */