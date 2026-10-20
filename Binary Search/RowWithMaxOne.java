import java.util.*;
public class RowWithMaxOne {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter rows in matrix");
      int rows=s.nextInt();
      System.out.println("Enter columns in matrix");
      int cols=s.nextInt();
      System.out.println("Enter values in the matrix");
      int arr[][]=new int[rows][cols];
      for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            arr[i][j]=s.nextInt();
        }
      }
      int ans=getRow(arr,rows,cols);
      System.out.println("Row with max 1's : "+ans);  
    }
    static int getRow(int arr[][],int rows,int cols){
        int maxCount=0;
        int ans=-1;
        for(int i=0;i<rows;i++){
            int count=cols-lowerBound(arr[i],cols,1);

            if (count>maxCount) {
                maxCount=count;
                ans=i;
            }
        }
        return ans;
    }
    static int lowerBound(int arr[],int n,int k){
        int ans=n;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+(high-low)/2);

            if (arr[mid]>=k) {
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
