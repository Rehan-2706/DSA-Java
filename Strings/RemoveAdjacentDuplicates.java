import java.util.*;
class RemoveAdjacentDuplicates{

    static String removeDuplicates(String str){

        StringBuilder answer=new StringBuilder();
        int top=-1;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(top>=0 && answer.charAt(top)==ch){
                answer.deleteCharAt(top);
                top--;
            }
            else{
                answer.append(ch);
                top++;
            }
        }

        return answer.toString();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=s.next();
        System.out.println("String after removing adjacent duplicates : "+removeDuplicates(str));
    }
}