import java.util.*;
public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Petrol", 112);
        map.put("Diesel", 95);
        map.put("Kerosene", 100);
        System.out.println(map.values());
        System.out.println(map);
        System.out.println("Size of HashMap is : "+map.size());

        if(map.containsKey("Petrol"))
        {
            System.out.println("Petrol is present in the map");
        }
        if(map.containsValue(100))
        {
            System.out.println("100 is the price of kerosene ");
        }
        System.out.println(map.getOrDefault("Grease", 0));

        Set<String> keys=map.keySet();
        for(String key:keys)
        {
            System.out.println(key+"->"+map.get(key));
        }

        System.out.println("Traversing using Iterator");
        for(Map.Entry<String,Integer> m:map.entrySet())
        {
            System.out.println("Key : "+m.getKey()+"  Value : "+m.getValue());
        }
        map.remove("Petrol");
        System.out.println(map);
        map.clear();
        if(map.isEmpty())
        {
            System.out.println("Map is Empty");
        }
    }
}
