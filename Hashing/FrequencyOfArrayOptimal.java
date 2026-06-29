import java.util.*;
public class FrequencyOfArrayOptimal {
    static void countFreq(int[] arr,int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int x:arr)
        {
            map.put(x, map.getOrDefault(x,0)+1);
        }
        System.out.println("Frequencies of array elements : ");
        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            System.out.println(m.getKey()+"  ->  "+m.getValue());
        }
    }
    public static void main(String[] args)
    {
        int[] arr={10,5,10,15,10,5};
        int n=arr.length;
        countFreq(arr,n);
    }
}
