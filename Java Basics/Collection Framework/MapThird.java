import java.util.*;
public class MapThird {
    public static void main(String[] args) {
        Map<String,String> m=new TreeMap<>();
        m.put("In", "India");
        m.putIfAbsent("In", "India2");
        m.put("En","England");
        m.put("Us", "United States");
        m.put("Bharat", "India");
        System.out.println(m);
        m.remove("Bharat");
        System.out.println(m);
         System.out.println( m.keySet());
         System.out.println(m.values());
         Set<Map.Entry<String,String>> entryset=m.entrySet();
         System.out.println(entryset);
         Map<String,String> m2=new TreeMap<>();
         m2.putAll(m);
         System.out.println(m2);
         System.out.println(m2.size());
         m2.clear();
         System.out.println(m2);
         System.out.println(m.getOrDefault("Ir", "Thankyou"));
         System.out.println(m.containsKey("In"));
         System.out.println(m.containsValue("India"));
         System.out.println(m);
         m.replace("En", "British");
         System.out.println(m);
         for(Map.Entry<String,String> entry:m.entrySet())
         {
            System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
         }
    }
}
