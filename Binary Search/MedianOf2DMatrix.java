import java.util.*;

public class MedianOf2DMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter rows in matrix");
        int rows = s.nextInt();
        System.out.println("Enter columns in matrix");
        int cols = s.nextInt();
        System.out.println("Enter values in the matrix");
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int ans=getMatrixMedian(arr,rows,cols);
        System.out.println("Median of the matrix : "+ans);
    }
    static int getMatrixMedian(int arr[][],int rows,int cols){
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<rows;i++){
            low=Math.min(low, arr[i][0]);
            high=Math.max(high, arr[i][cols-1]);
        }
        int required=(rows*cols)/2;

        while (low<=high) {
            int mid=(low+(high-low)/2);
            int smallEqualsCount=getSmallEqualsCount(arr,rows,cols,mid);
            if (smallEqualsCount<=required) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    static int getSmallEqualsCount(int arr[][],int rows,int cols,int mid){
        int count=0;
        for(int i=0;i<rows;i++){
            count+=upperBound(arr[i],mid);
        }
        return count;
    }
    static int upperBound(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while (low<=high) {
            int mid=(low+(high-low)/2);
            if (arr[mid]>target) {
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
