import java.util.Vector;

public class Lists3 {
    public static void main(String []args)
    {
        Vector<Integer> v=new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        System.out.println(v);
          Vector<Integer> v2=new Vector<>();
        v2.add(4);
        v2.add(5);
        v2.add(6);
        System.out.println(v2);
        v.addAll(v2);
        System.out.println(v);
        v.remove(0);
        System.out.println(v);
        v.removeAll(v2);
        System.out.println(v);
        
    }
}
