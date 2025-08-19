public class ReversingDigit {
    static int sum=0;
    static void rev1(int n){ // 1234/10 , remider == 4 ; 4*10=40+reminder(3)=43*10=430+reminder(2)=432*10=4320+reminder(1)
        if(n==0){
            return ;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }
    static void rev2(int n){ // if n == rev(n) then n is an palinddrome number

    }
    public static void main(String[] args) {
        rev1(1234);
        System.out.println(sum);
    }
}
