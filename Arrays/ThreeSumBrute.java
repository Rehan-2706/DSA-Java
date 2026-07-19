import java.util.*;
public class ThreeSumBrute {

    static List<List<Integer>> getTriplets(int[] arr){

        HashSet<List<Integer>> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(set);
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
