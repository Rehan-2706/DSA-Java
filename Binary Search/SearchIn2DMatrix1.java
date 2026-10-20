import java.util.*;
public class SearchIn2DMatrix1 {
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
      System.out.println("Enter element to search");
      int target=s.nextInt();
      boolean result=isPresent(arr,rows,cols,target);
      if (result) {
        System.out.println("Element is present in the array");
      }else{
        System.out.println("Element is not present inside the array");
      }
    }
    static boolean isPresent(int arr[][],int rows,int cols,int target){
        int low=0;
        int high=rows*cols-1;
        while (low<=high) {
            int mid=(low+(high-low)/2);
            int r=mid/cols;
            int c=mid%cols;

            if (arr[r][c]==target) {
                return true;
            }else if(arr[r][c]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
}
