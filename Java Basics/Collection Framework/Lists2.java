import java.util.LinkedList;

class Lists2
{
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        //ll.remove(0);
        //System.out.println(ll);
        //LinkedList<Integer> l2=new LinkedList<>();
        //l2.addAll(ll);
       // System.out.println(l2);
       ll.addFirst(10);
       ll.addLast(190);
       ll.removeFirst();
       ll.removeLast();
      System.out.println(ll);
      System.out.println(ll.peek());
      int x=ll.poll();
      System.out.println(ll);
    }
}