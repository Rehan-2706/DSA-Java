import java.util.*;
public class RepeatingAndMissingBetter {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=s.nextInt();
        System.out.println("Enter array elements ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        List<Integer>ans=getValues(arr);
        System.out.println("Repeating and missing no. are : ");
        System.out.println(ans);
    }
    static List<Integer> getValues(int arr[]){
        ArrayList<Integer>list=new ArrayList<>();

        int freq[]=new int[arr.length+1];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        for(int i=1;i<=arr.length;i++){
            if (freq[i]==0) {
                list.add(i);
            }else if (freq[i]==2) {
                list.add(i);
            }
        }
        return  list;
    }
}