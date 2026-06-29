public class pattern17 {   //very very important
    public static void main(String []args)
    {
        int n=4;
        for(int i=0;i<n;i++)
        {
            for(int s=0;s<n-1-i;s++)
            {
                System.out.print(" ");
            }
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i +1;j++)
            {
                System.out.print(ch);
                if(j<=breakpoint)
                ch++;
                else
                    ch--;
            }
            System.out.println();
        }
    }
}
