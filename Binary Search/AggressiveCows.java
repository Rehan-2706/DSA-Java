import java.util.*;
public class AggressiveCows {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of stalls");
        int n=s.nextInt();
        int stalls[]=new int[n];
        System.out.println("Enter stall positions : ");
        for(int i=0;i<n;i++){
            stalls[i]=s.nextInt();
        }
        System.out.println("Enter number of cows : ");
        int cows=s.nextInt();
        System.out.println("Maximum of minimum distance between cows is : "+getDistance(stalls,cows));
    }
    static int getDistance(int stalls[],int cows){
        Arrays.sort(stalls);
        int low=0;
        int high=stalls[stalls.length-1]-stalls[0];
        while (low<=high) {
            int mid=(low+(high-low)/2);
            if (canWePlace(stalls,cows,mid)) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    static boolean canWePlace(int stalls[],int cows,int mid){
        int cowCount=1;
        int lastPlaced=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastPlaced>=mid){
                cowCount++;
                lastPlaced=stalls[i];
            }
            if (cowCount>=cows) {
                return true;
            }
        }
        return false;
    }
}