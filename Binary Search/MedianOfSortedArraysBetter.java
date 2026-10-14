import java.util.*;
public class MedianOfSortedArraysBetter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of first sorted array ");
        int n1=s.nextInt();
        System.out.println("Enter elements of first sorted array ");
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=s.nextInt();
        }
        System.out.println("Enter length of second sorted array ");
        int n2=s.nextInt();
        System.out.println("Enter elements in second sorted array ");
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=s.nextInt();
        }
        double answer=getMedian(arr1,arr2);
        System.out.println("Median of 2 sorted arrays is : "+answer);
    }
    static double getMedian(int arr1[],int arr2[]){
         int n1=arr1.length;
         int n2=arr2.length;
         int n=n1+n2;

         int index1=n/2;
         int index2=index1-1;

         int ele1=-1;
         int ele2=-1;

         int i=0;
         int j=0;
        int count=0;
         while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                if(count==index2) ele2=arr1[i];
                if(count==index1) ele1=arr1[i];

                i++;
                count++;
            }
            else{
                 if(count==index2) ele2=arr2[j];
                if(count==index1) ele1=arr2[j];

                j++;
                count++;
            }
         }
         while (i<arr1.length) {
            if(count==index2) ele2=arr1[i];
                if(count==index1) ele1=arr1[i];

                i++;
                count++;
         }
         while (j<arr2.length) {
             if(count==index2) ele2=arr2[j];
                if(count==index1) ele1=arr2[j];

                j++;
                count++;
         }

         if(n%2==1) return (double)ele1;
         else return (double)((double)ele1+(double)ele2)/2;
    }
}
