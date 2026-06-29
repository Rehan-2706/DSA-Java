import java.util.*;
public class QueueThird {
    public static void main(String[] args) {
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
