import java.util.Scanner;
public class basic {
    // static void display(int[] arr)
    // {
    //     System.out.println("Array elemnts are :");
    //             for(int i=0;i<arr.length;i++)
    //     {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    // static int sum(int[] arr)
    // {
    //     int s=0;
    //        for(int i=0;i<arr.length;i++)
    //     {
    //        s+=arr[i];
    //     }
    //     return s;
    // }
    // static void findminmax(int[] arr)
    // {
    //     int min=arr[0];
    //     int max=arr[0];
    //      for(int i=1;i<arr.length;i++)
    //     {
    //         if(arr[i]>max)
    //         max=arr[i];
    //         if(arr[i]<min)
    //         min=arr[i];
    //     }
    //     System.out.println("max="+max+" min= "+min);
    // }
    // static void reversearray(int[] arr)
    // {
    //     int start=0;
    //     int end=arr.length-1;
    //     while(start<end)
    //     {
    //         int temp=arr[start];
    //         arr[start]=arr[end];
    //         arr[end]=temp;
    //         start++;
    //         end--;
    //     }
    // System.out.println("Reverse array is : ");
    // for(int i=0;i<arr.length;i++)
    // {
    //     System.out.print(arr[i]);
    // }
    // }
    // static void evenoddcount(int[] arr)
    // {
    //     int even=0;
    //     int odd=0;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(arr[i]%2==0)
    //         even++;
    //         else
    //         odd++;
    //     }
    //     System.out.println("Number of Even= "+even+"Number of odd "+odd);
    // }
    // static boolean linearsearch(int[] arr,int search)
    // {
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(arr[i]==search)
    //         return true;
    //     }
    //     return false;
    // }
    static double average(int[] arr)
    {
        double avg=0;
        for(int i=0;i<arr.length;i++)
        {
            avg+=arr[i];
        }
        return (avg)/arr.length;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        // display(arr);
        // int s1=sum(arr);
        // System.out.println("Sum of array elements is"+ s1);
        // findminmax(arr);
        // reversearray(arr);
        // evenoddcount(arr);
        // System.out.println("enter elemnt to search ");
        // int search=s.nextInt();
        // boolean b=linearsearch(arr,search);
        // System.out.println("Elemnt found "+b);
        double avg=average(arr);
        System.out.println("Average of array elemts is "+avg);
    }
}
