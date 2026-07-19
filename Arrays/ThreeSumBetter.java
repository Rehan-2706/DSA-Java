import java.util.*;
public class ThreeSumBetter {

    static List<List<Integer>> getTriplets(int[] arr){

        HashSet<List<Integer>> answer=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int third=-(arr[i]+arr[j]);
                
                if(set.contains(third)){
                    List<Integer> temp=Arrays.asList(arr[i],arr[j],third);
                    Collections.sort(temp);
                    answer.add(temp);
                }
                set.add(arr[j]);
            }
        }
        return new ArrayList<>(answer);
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
