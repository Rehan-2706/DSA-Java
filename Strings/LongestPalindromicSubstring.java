import java.util.*;
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.next();
        String answer=getLongestSubString(str);
        System.out.println("Longest Palindromic Substring : "+answer);
    }
    static String getLongestSubString(String str){
        int max=0;
        int start=0;

        for(int i=0;i<str.length();i++){
            int len1=getLength(str,i,i);
            int len2=getLength(str,i,i+1);
            int len=Math.max(len1, len2);
            if (max<len) {
                max=len;
                start=i-((len-1)/2);
            }
        }
        return str.substring(start,start+max);
    }
    static int getLength(String str,int left,int right){
        while (left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}
