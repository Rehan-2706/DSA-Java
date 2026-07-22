import java.util.*;

public class MergeOverLappingSubIntervals {

    static List<List<Integer>> getMergedIntervals(int arr[][])
    {
        int n=arr.length;
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        for(int i=0;i<n;i++)
        {
            int start=arr[i][0];
            int end=arr[i][1];

            while(i+1<n && arr[i+1][0]<=end){
                end=Math.max(end, arr[i+1][1]);
                i++;
            }
            answer.add(Arrays.asList(start,end));
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of sub intervals ");
        int n=s.nextInt();

        int arr[][]=new int[n][2];

        System.out.println("Enter the sub intervals ");
        for(int i=0;i<n;i++)
        {
            arr[i][0]=s.nextInt();
            arr[i][1]=s.nextInt();
        }
        List<List<Integer>> li=getMergedIntervals(arr);

        System.out.println("Merged sub Intervals : ");
        for(List<Integer> temp:li)
        {
            System.out.println(temp);
        }
    }
}
