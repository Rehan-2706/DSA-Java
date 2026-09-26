import java.util.*;
public class SingleElementInSortedArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n=s.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int answer=getSingleElement(arr,n);
        System.out.println("The number that appears only once in the array is : "+answer);
    }
    static int getSingleElement(int arr[],int n){
        if(arr.length==1) return arr[0];
        if (arr[0]!=arr[1]) {
            return arr[0];
        }
        if (arr[n-1]!=arr[n-2]) {
            return arr[n-1];
        }

        int low=1;
        int high=n-2;

        while (low<=high) {
            int mid=(low+(high-low)/2);

            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];

            if((mid%2==0 && arr[mid]==arr[mid+1])||(mid%2==1 && arr[mid]==arr[mid-1])){
                low=mid+1;
            }else{
                 high=mid-1;
            }
        }
        return -1;
    }
}
