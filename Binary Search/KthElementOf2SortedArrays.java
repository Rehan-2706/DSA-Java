import java.util.*;
public class KthElementOf2SortedArrays {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter sorted elements of first array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] nums2 = new int[n2];

        System.out.println("Enter sorted elements of second array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k");
        int k=sc.nextInt();


        int answer = findKthSmallest(nums1, nums2,k);
        System.out.println("Kth element = " + answer);

        sc.close();
    }
    static int findKthSmallest(int nums1[],int nums2[],int k){
        int n1=nums1.length;
        int n2=nums2.length;

        if(n1>n2) return findKthSmallest(nums2, nums1, k);

        int low=Math.max(k-n2,0);
        int high=Math.min(k,n1);

        int left=k;

        while (low<=high) {
            int mid1=(low+(high-low)/2);
            int mid2=left-mid1;

            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;

            if(mid1<n1) r1=nums1[mid1];
            if(mid2<n2) r2=nums2[mid2];

            if(mid1-1>=0) l1=nums1[mid1-1];
            if(mid2-1>=0) l2=nums2[mid2-1];

            if(l1<=r2 && l2<=r1){
                return Math.max(l1, l2);
            }else if(l1>r2){
                high=mid1-1;
            }else{
                low=mid1+1;
            }
        }
        return 0;
    }
}
