import java.util.*;
public class PaintersPartition{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of boards : ");
        int n=s.nextInt();
        System.out.println("Enter size of each board");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter number of painnters : ");
        int A=s.nextInt();
        System.out.println("Enter units of time for painters to paint the board ");
        int B=s.nextInt();
        System.out.println("Minimum time required to paint the board : "+getMinTime(arr,A,B));
    }
    static int getMinTime(int arr[],int A,int B){
        int low=getMax(arr);
        int high=getSum(arr);
        long mod=10000003;
        while (low<=high) {
            int mid=(low+(high-low)/2);
            int painters=getPainters(arr,mid);
            if (painters<=A) {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        long answer=((low%mod)*(B%mod))%mod;
        return (int)answer;
    }
    static int getMax(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    static int getSum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static int getPainters(int arr[],int mid){
        int painters=1;
        int boardLength=0;
        for(int i=0;i<arr.length;i++){
            if (boardLength+arr[i]<=mid) {
                boardLength+=arr[i];
            }else{
                painters+=1;
                boardLength=arr[i];
            }
        }
        return painters;
    }
}