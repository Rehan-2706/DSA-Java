import java.util.*;
public class Maximum69Numbers {
    static int getLargest(int n)
    {
        char[] arr=String.valueOf(n).toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='6')
            {
                arr[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number that only contains the digits 6 and 9");
        int n=s.nextInt();
        System.out.println("Larget number after changing single digit is : "+getLargest(n));
    }
}
