import java.util.*;
public class RepeatingAndMissingBrute {

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

        for(int i=1;i<=arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if (arr[j]==i) {
                    count++;
                }
            }
            if (count==0) {
                list.add(i);
            }else if (count==2) {
                list.add(i);
            }
        }
        return list;
    }
}