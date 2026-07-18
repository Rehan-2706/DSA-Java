import java.util.*;
class PartitionArray{

    static boolean canBePartitioned(int []arr){
        int totalsum=0;

        for(int num:arr){
            totalsum+=num;
        }
        if(totalsum%3!=0) return false;

        int target=totalsum/3;
        int count=0;
        int currentsum=0;

        for(int num:arr){
            currentsum+=num;
            if(currentsum==target){
                currentsum=0;
                count++;
            }
        }
        return count>=3;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        if(canBePartitioned(arr)){
            System.out.println("Array can be partitioned into three equal parts ");
        }
        else{
            System.out.println("Array cannot be partitioned into three equal parts");
        }
    }
}