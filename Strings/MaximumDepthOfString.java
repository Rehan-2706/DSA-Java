import java.util.*;

public class MaximumDepthOfString {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();
        int answer = getMaxDepth(str);
        System.out.println("Answer : " + answer);
    }

    static int getMaxDepth(String str) {
        int maxi = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                count++;
                maxi = Math.max(maxi, count);
            } else {
                if (ch != ')') {
                    continue;
                }
                count--;
            }
        }
        return maxi;
    }
}
