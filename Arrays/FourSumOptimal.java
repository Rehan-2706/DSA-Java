import java.util.*;

public class FourSumOptimal {

    static List<List<Integer>> getQuads(int[] arr, int target) {

        int n = arr.length;
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0;i<n;i++)
        {
            if(i>0 && arr[i-1]==arr[i]) continue;

            for(int j=i+1;j<n;j++)
            {
                if(j!=i+1 && arr[j-1]==arr[j]) continue;

                int left=j+1;
                int right=n-1;
                while(left<right)
                {
                    long sum=(long) arr[i]+arr[j]+arr[left]+arr[right];

                    if(target==(int)sum)
                    {
                        List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[left],arr[right]);
                        answer.add(temp);
                        left++;
                        right--;
                        while(left<right && arr[left-1]==arr[left]) left++;
                        while(left<right && arr[right+1]==arr[right]) right--;
                    }
                    else if(sum>target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        List<List<Integer>> ans = getQuads(arr, target);

        if (ans.isEmpty()) {
            System.out.println("No quadruplets found.");
        } else {
            System.out.println("Unique quadruplets:");
            for (List<Integer> quad : ans) {
                System.out.println(quad);
            }
        }

        sc.close();
    }
}