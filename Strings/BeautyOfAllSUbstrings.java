import java.util.Scanner;

public class BeautyOfAllSUbstrings {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.next();
        int answer=getBeauty(str);
        System.out.println("Beauty of all Substrings : "+answer);
    }
    static int getBeauty(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            int freq[]=new int[26];
            int max=0;
            for(int j=i;j<str.length();j++){
                freq[str.charAt(j)-'a']++;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if (freq[k]>0) {
                        max=Math.max(max, freq[k]);
                        min=Math.min(min, freq[k]);
                    }
                }
                sum+=max-min;
            }
        }
        return sum;
    }
}
