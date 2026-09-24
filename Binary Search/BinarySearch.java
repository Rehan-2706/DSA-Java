import java.util.*;
public class BinarySearch {

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
        int index=getIndex(arr,target);

        if (index==-1) {
            System.out.println("Element is not present in the array ");
        }
        else{
            System.out.println("Element is present at index "+index);
        }
    }
    static int getIndex(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while (low<=high) {
            int mid=low+(high-low)/2;

            if (arr[mid]==target) {
                return mid;
            }else if(target>arr[mid]) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}