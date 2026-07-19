import java.util.*;
public class ThreeSumOptimal {

    static List<List<Integer>> getTriplets(int[] arr){

        List<List<Integer>> answer=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int left=i+1;
            int right=n-1;
            while(left<right){

                int sum=arr[i]+arr[left]+arr[right];
                if(sum>0){
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    List<Integer> temp=Arrays.asList(arr[i],arr[left],arr[right]);
                    answer.add(temp);
                    left++;
                    right--;

                    while(left<right && arr[left-1]==arr[left]) left++;
                    while(left<right && arr[right+1]==arr[right]) right--;
                }
            }
        }
        return answer;
        
    }
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Unique triplets that sum up to 0 are : ");
        List<List<Integer>> triplet=getTriplets(arr);

        for(List<Integer> li :triplet){
            System.out.println(li);
        }
    }
}
