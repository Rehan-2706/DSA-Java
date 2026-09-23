import java.util.*;
public class ReversePairs {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=s.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int ans=getReversePairs(arr);
        System.out.println("No. of reverse Pairs in the array : "+ans);
    }
    static int getReversePairs(int arr[]){
        int count=0;

        int low=0;
        int high=arr.length-1;
        count+=mergeSort(arr,low,high);

        return count;
    }
    static int mergeSort(int arr[],int low,int high){
        int count=0;
        if (low>=high) {
            return count;
        }
        int mid=(low+high)/2;
        count+=mergeSort(arr, low, mid);
        count+=mergeSort(arr, mid+1, high);
        count+=getCount(arr,low,mid,high);
        merge(arr,low,mid,high);
        return  count;
    }
    static int getCount(int arr[],int low,int mid,int high){
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while (right<=high && (long)arr[i]> (long)2*arr[right]) {
                right++;
            }
            count+=(right-(mid+1));
        }
        return count;
    }
    static void merge(int arr[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer>list=new ArrayList<>();
        while (left<=mid && right<=high) {
            
            if (arr[left]<=arr[right]) {
                
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
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
    }
}
