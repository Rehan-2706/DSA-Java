import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeadersInArray {
    static ArrayList<Integer> findLeaders(int[] arr)
    {
        int n=arr.length;
        ArrayList<Integer> leaders=new ArrayList<>();
        int max=arr[n-1];
        leaders.add(max);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                leaders.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
        }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n=s.nextInt();
        System.out.println("Enter array elements ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }  
        ArrayList<Integer> temp=findLeaders(arr);
        System.out.println("Leaders in Array are");
        for(int x:temp)
        {
            System.out.print(x+" ");
        }
    }
}
