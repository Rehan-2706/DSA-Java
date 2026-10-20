import java.util.*;;
public class SearchIn2DMatrix2 {
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
      boolean result=isPresent(arr,target);
      if (result) {
        System.out.println("Element is present in the array");
      }else{
        System.out.println("Element is not present inside the array");
      }
    }
    static boolean isPresent(int arr[][],int target){
        int low=0;
        int high=arr[0].length-1;
        while (low<arr.length && high>=0) {
            if (arr[low][high]==target) {
                return true;
            }
            else if (arr[low][high]>target) {
                high--;
            }
            else{
                low++;
            }
        }
        return false;
    }
}
