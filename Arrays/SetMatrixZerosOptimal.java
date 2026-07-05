import java.util.Scanner;

public class SetMatrixZerosOptimal {
    static void setMatrix(int[][] arr,int rows,int cols)
    {
        int col0=1;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j]==0)
                {
                    arr[i][0]=0;

                    if(j!=0)
                    {
                        arr[0][j]=0;
                    }
                    else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<cols;j++)
            {
                if(arr[i][j]!=0)
                {
                if(arr[i][0]==0 || arr[0][j]==0)
                {
                    arr[i][j]=0;
                }
            }
            }
        }
        if(arr[0][0]==0)
        {
            for(int j=0;j<cols;j++)
            {
                arr[0][j]=0;
            }
        }
        if(col0==0)
        {
            for(int i=0;i<rows;i++)
            {
                arr[i][0]=0;
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
