import java.util.*;
public class MinimizeMaxDistanceBrute {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n=s.nextInt();
        System.out.println("Enter the gas station co-ordinates");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter no. of gas stations to place ");
        int k=s.nextInt();
        double answer=getMinimumDistance(arr,k);
        System.out.println("Minimized maximum distance between any 2 co-ordinates : "+answer);
    }
    static double getMinimumDistance(int arr[],int k){


        Arrays.sort(arr);

        int howManyPlaced[]=new int[arr.length-1];
        for(int gas=1;gas<=k;gas++){
            double maxSection=-1;
            int maxIndex=-1;

            for(int i=0;i<arr.length-1;i++){
                double difference=arr[i+1]-arr[i];
                double sectionLength=difference/(howManyPlaced[i]+1);
                if(sectionLength>maxSection){
                    maxSection=sectionLength;
                    maxIndex=i;
                }
            }
            howManyPlaced[maxIndex]++;
        }
        double maxSection=-1;
        for(int i=0;i<arr.length-1;i++){
            double difference=arr[i+1]-arr[i];
            double sectionLength=difference/(howManyPlaced[i]+1);
            maxSection=Math.max(maxSection, sectionLength);
        }
        return maxSection;
    }
}
