
public class MaxAndMinInArray {

    static void calci(int arr[],int n)
    {
        boolean[] visited=new boolean[n];
        int minele=0;
        int maxele=0;
        int maxfreq=0;
        int minfreq=n;

        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            if(visited[i])
                continue;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    visited[j]=true;
                }
            }

            if(count>maxfreq)
            {
                maxele=arr[i];
                maxfreq=count;
            }
             if(count<minfreq)
            {
                minele=arr[i];
                minfreq=count;
            }
        }
        System.out.println("Minimum Frequency : "+minfreq+"  Minimum frequency Element : "+minele);
        System.out.println("Maximum Frequency : "+maxfreq+"  Maximum frequency Element : "+maxele);
    }
    public static void main(String[] args) {
        int arr[]={10,5,10,15,10,5};
        int n=arr.length;
        calci(arr,n);
    }
}
