 class  Employee { // custom class :: in a java file there should be only one access specifier attached with the class
     int id;// attribute 1
     String name;// attribute 2
     public void printDetails(){
         System.out.println("My id is "+ id);
         System.out.println("My name is "+ name);
     }
 }
public class Custom_class {
    public static void main(String[]args){
        System.out.println("This is our custom java class");
        Employee ayush = new Employee();// instantiataing a new employee object
        Employee harry = new Employee();
        harry.id = 12;
        harry.name= "john khandelwal";
        ayush.id=22;
        ayush.name= "papa shango";
       // System.out.println(ayush.id);
       // System.out.println(ayush.name);
        ayush.printDetails();
      harry.printDetails();
    }

}
