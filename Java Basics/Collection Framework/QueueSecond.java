import java.util.*;
public class QueueSecond {
    public static void main(String[] args)
    {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.offer(1);
        dq.offer(2);
        dq.offer(3);
        System.out.println(dq);
        dq.addFirst(0);
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.poll());
        System.out.println(dq);
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }
}
