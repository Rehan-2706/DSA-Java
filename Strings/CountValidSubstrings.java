import java.util.*;
public class CountValidSubstrings {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.next();
        int answer=getValidCount(str);
        System.out.println("No. of valid substrings : "+answer);
    }
    static int getValidCount(String str){
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++){
            int freq[]=new int[26];
            for(int j=i;j<n;j++){
                freq[str.charAt(j)- 'a']++;

                int odd=0;
                for(int k=0;k<26;k++){
                    if (freq[k]%2!=0) {
                        odd++;
                    }
                }
                if (odd<=1) {
                    count++;
                }
            }
        }
        return count;
    }
}
