import java.util.Scanner;

public class SetMatrixZerosBetter {
    static void setMatrix(int[][] arr,int rows,int cols)
    {
        int tempcol[]=new int[cols];
        int temprow[]=new int[rows];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j]==0)
                {
                    temprow[i]=1;
                    tempcol[j]=1;
                }
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(temprow[i]==1 || tempcol[j]==1)
                {
                    arr[i][j]=0;
                }
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
