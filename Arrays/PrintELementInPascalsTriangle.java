import java.util.*;
 class PrintElementInPascalsTriangle{
    static long getElement(int r,int c)
    {
        long result=1;

        for(int i=0;i<c;i++)
        {
            result=result*(r-i);
            result=result/(i+1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter row and column number");
        int r=s.nextInt();
        int c=s.nextInt();
        System.out.println("Element at "+r+"th row and "+c+"th column is : "+getElement(r-1,c-1));
    }
}