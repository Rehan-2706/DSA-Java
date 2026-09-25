import java.util.*;
public class LowerBound {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n=s.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter element to find");
        int target=s.nextInt();
        int index=getLowerBound(arr,target);
        System.out.println("Lower Bound : "+index);
    }
    static int getLowerBound(int arr[],int target){
            int low=0;
            int high=arr.length-1;
            int lowBound=arr.length;
            while (low<=high) {
                int mid=low+(high-low)/2;
                if (arr[mid]>=target) {
                    lowBound=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
                
            }
            return lowBound;
    }
}