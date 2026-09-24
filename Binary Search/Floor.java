import java.util.*;
public class Floor {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n=s.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter element to Check");
        int target=s.nextInt();
        int answer=getFloor(arr,target);
        System.out.println("Floor : "+answer);
    }
    static int getFloor(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if (arr[mid]<=target) {
                ans=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        return ans;
    }
}