import java.util.Scanner;

public class SetMatrixZerosBruteForce {
    static void setMatrix(int[][] arr,int rows,int cols)
    {

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j]==0)
                {
                    markRow(arr,i,cols);
                    markCol(arr,j,rows);
                }
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j]==-1)
                {
                    arr[i][j]=0;
                }
            }
        }
    }
    static void markRow(int[][] arr,int i,int cols)
    {
        for(int j=0;j<cols;j++)
        {
            if(arr[i][j]!=0)
            {
                arr[i][j]=-1;
            }
        }
    }
      static void markCol(int[][] arr,int j,int rows)
    {
        for(int i=0;i<rows;i++)
        {
            if(arr[i][j]!=0)
            {
                arr[i][j]=-1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows in matrix ");
        int rows=s.nextInt();
        System.out.println("Enter number of columns in matrix ");
        int cols=s.nextInt();
        System.out.println("Enter Matrix");
        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        setMatrix(arr,rows,cols);
        System.out.println("Matrix after setting to zeros : ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
