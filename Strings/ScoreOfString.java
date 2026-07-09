import java.util.*;
public class ScoreOfString
{
    static int findScore(String str)
    {
        int score = 0;

        for(int i=1;i<str.length();i++)
        {
            score+=Math.abs(str.charAt(i)-str.charAt(i-1));
        }
        return score;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=s.next();
        System.out.println("Score of String : "+findScore(str));
    }
}