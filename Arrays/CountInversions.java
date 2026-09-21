import java.util.*;
public class CountInversions {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=s.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int ans=getInversions(arr);
        System.out.println("No. of inversions in the array : "+ans);

    }
    static int getInversions(int arr[]){
        int count=mergeSort(arr,0,arr.length-1);
        return count;
    }
    static int mergeSort(int arr[],int low,int high){
        int count=0;
        if(low>=high) return count;

        int mid=(low+high)/2;
        count+=mergeSort(arr, low, mid);
        count+=mergeSort(arr, mid+1, high);
        count+=merge(arr,low,mid,high);

        return count;
    }
    static int merge(int arr[],int low,int mid,int high){
        int count=0;
        int left=low;
        int right=mid+1;

        ArrayList<Integer>list=new ArrayList<>();

        while (left<=mid && right<=high) {
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
                count+=mid-left+1;
            }
        }
        while (left<=mid) {
            list.add(arr[left]);
            left++;
        }
        while (right<=high) {
            list.add(arr[right]);
            right++;
        }
        int k=0;
        for(int i=low;i<=high;i++){
            arr[i]=list.get(k);
            k++;
        }
        return count;
    }
}
