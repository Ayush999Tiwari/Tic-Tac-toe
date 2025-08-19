public class ComparisionString {
    public static void main(String[]args){
        String a = "kunal";
        String b = "kunal";

       // System.out.println(a==b);8  // it will gives true
        String name1 = new String("kunal");
        String name2 = new String("kunal");
       //System.out.println(name1==name2);
        // only checking the value of both ref variable
        System.out.println(name1.equals(name2));
        String name3 = name1;
        System.out.println(name3);
        System.out.println(name1 == name3);
        System.out.println(name1 == name2);
    }
}
