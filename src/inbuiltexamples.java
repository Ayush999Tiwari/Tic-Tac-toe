import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class inbuiltexamples {
    public static void main(String[] args) {
     /*   Stack<Integer> stack=new Stack<>();
        stack.push(11);
        stack.push(22);
        stack.push(18);
        stack.push(45);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());*/

            Queue<Integer> queue= new LinkedList<>();
            queue.add(3);
        queue.add(45);
        queue.add(76);
        queue.add(23);
        queue.add(12);

        System.out.println(queue.remove());
    }
}
