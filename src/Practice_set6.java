public class Practice_set6 {
    public static void main(String[]args) {
        /*question1
        float sum = 0;
        float[] numbers= {67.9f,90f,53.5f,983f,3.1f};
        for(int i = 0; i<numbers.length; i++){
             sum += numbers[i];

        }
        System.out.println("The sum of elements of array is: "+sum);*/
        //question2
       /* float[] numbers= {67.9f,90f,53.5f,983f,3.1f};
        float num = 90f;
        boolean isInArray= false;
        for(float element:numbers){
            if(num==element){
                isInArray=true;
                break;
            }

        }
        if(isInArray){
            System.out.println("The value is present in array");
        }
        else{
            System.out.println("The value is not present in this array");
        }*/
        //question3
       /* int sum = 0;
        int [] numbers= {87,76,68,98,64};
        for(int i = 0; i<numbers.length; i++){
            sum += numbers[i];

        }
        System.out.println("The average value of this  array is: "+sum/numbers.length);*/
        //question4
        int [][] mat1 = {{2, 3, 4},
                        {6, 7, 8}};
        int [][] mat2 = {{1,9,0},
                         {6,4,2}};
       int [][] result = {{0,0,0},
                        {0,0,0}};
        for(int i=0; i<mat1.length; i++){
            for(int j= 0;j<mat1[i].length;j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = (mat1[i][j] + mat2[i][j]);
            }
            System.out.println(" ");
        }
    }
}
