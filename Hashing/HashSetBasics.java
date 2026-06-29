import java.util.HashSet;
import java.util.Iterator;
class HashSetBasics
{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println("Original Set = "+set);
        System.out.println("Size of set is "+set.size());

        System.out.println("Traversal Using Iterator : ");
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        if(set.contains(1))
        {
            System.out.println("1 is present in the set ");
        }
        set.remove(2);
        System.out.println("2 is removed From the set");
        set.clear();
        System.out.println(set);
        if(set.isEmpty())
        {
            System.out.println("Set is Empty");
        }
    }
}