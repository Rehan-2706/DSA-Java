import java.util.*;
public class RemoveOuterMostParanthesis{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=s.nextLine();
        String answer=getRemovedParanthesis(str);
        System.out.println("Answer : "+answer);
    }
    static String getRemovedParanthesis(String str){
        StringBuilder ans=new StringBuilder();

        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                if (count>0) {
                    ans.append(ch);
                }
                count++;
            }else{
                count--;
                if (count>0) {
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}