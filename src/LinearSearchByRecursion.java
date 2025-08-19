public class LinearSearchByRecursion {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7};
        System.out.println(linearsearch(arr,3,0));
        System.out.println(findindex(arr,2,0));
    }
    static boolean linearsearch(int[]arr,int target,int index){
        // base condition
        if(index==arr.length){
            return false;

        }
        return arr[index]==target || linearsearch(arr,target , index+1);

    }
    static int findindex(int[]arr,int target,int index){
        // base condition
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return findindex(arr,target,index+1);
        }

    }
}