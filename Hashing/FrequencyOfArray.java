public class FrequencyOfArray
{
    static void countFreq(int []arr,int n)
    {
        boolean[] visited=new boolean[n];
       
        for(int i=0;i<arr.length;i++)
        {
             int count=1;
            if(visited[i])
                continue;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+"  ->  "+count);
        }
    }
    public static void main(String[] args)
    {
        int arr[]={10,5,10,15,10,5};
        int n=arr.length;
        countFreq(arr,n);
    }
}