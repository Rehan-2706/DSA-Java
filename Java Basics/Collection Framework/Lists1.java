import java.util.*;

class Lists1 {
    public static void main(String[] args) {
        Collection<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(5);
        System.out.println("List Elements are " + arr);
        System.out.println("Elements is List2 are " + arr2);
        arr.addAll(arr2);
        System.out.println("Elemets in list one are " + arr);
        arr.remove(1);
        System.out.println(arr);
        arr.removeAll(arr2);
        System.out.println(arr);
        System.out.println(arr.size());

        arr.clear();
        System.out.println(arr);

        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(1);
        arr3.add(2);
        arr3.add(3);
        arr3.add(4);
        arr3.add(5);
        Iterator<Integer> it = arr3.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Collections.sort(arr3);

        System.out.println("List3 after sorting is ascending " + arr3);
        Collections.sort(arr3, Collections.reverseOrder());
        System.out.println("List3 after sorting in descending order " + arr3);

        for (int i = arr3.size() - 1; i >= 0; i--) {
            System.out.println(arr3.get(i));
        }
        arr3.set(0, 67);
        System.out.println(arr3);

        Object[] arrn = arr3.toArray();
        for (Object x : arrn) {
            System.out.println(x);
        }
        System.out.println(arr3.contains(67));
    }
}