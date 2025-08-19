package String_Recursion;

public class subset {
    public static void main(String[] args) {
        subset("","abc");
    }
    static void subset(String p, String up){ // two variables p for processed and up for unprocessed
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
    }
}
