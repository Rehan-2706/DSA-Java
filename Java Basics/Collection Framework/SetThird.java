import java.util.*;
public class SetThird {
    public static void main(String[] args)
    {
        Set<Integer> s=new TreeSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(1);
        s.add(4);
        System.out.println(s);
        s.remove(4);
        System.out.println(s);
        System.out.println(s.contains(1));
        Set<Integer> s2=new TreeSet<>();
        s2.add(5);
        s2.add(1);
        s2.add(2);
        s2.add(3);
        s2.add(4);
        System.out.println(s2);
        System.out.println(s.containsAll(s2));
        System.out.println(s2.containsAll(s));
        s2.retainAll(s);
        System.out.println(s2);
    }
}

