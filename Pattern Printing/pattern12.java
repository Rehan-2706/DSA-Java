public class pattern12 {
    public static void main(String[] args) {           //important
        int n=4;
        int spaces=2*(n-1);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int s=1;s<=spaces;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            spaces-=2;
        }
    }
}
