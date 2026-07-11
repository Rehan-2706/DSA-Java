import java.util.*;
public class SpiralMatrix {

    static void printSpiral(int[][] arr,int rows,int cols)
    {
        int left=0;
        int right=cols-1;
        int top=0;
        int bottom=rows-1;
        ArrayList<Integer> list=new ArrayList<>();

        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                list.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                list.add(arr[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of rows in matrix");
        int rows=s.nextInt();
        System.out.println("Enter no. of columns");
        int cols=s.nextInt();
        System.out.println("Enter values in the matrix : ");
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix in spiral order :");
        printSpiral(arr,rows,cols);
    }
}
