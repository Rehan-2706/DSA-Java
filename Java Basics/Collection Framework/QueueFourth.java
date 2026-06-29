import java.util.*;
public class QueueFourth {
    public static void main(String[] args)
    {
        Queue<Integer> q=new PriorityQueue<>((a,b)->b-a);

        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);
       /*  System.out.println(q.poll());
        System.out.println(q);
          System.out.println(q.poll());
        System.out.println(q);*/


               System.out.println(q.poll());
        System.out.println(q);
          System.out.println(q.poll());
        System.out.println(q);
    }
}
