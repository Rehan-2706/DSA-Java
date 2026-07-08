import java.util.*;

public class FindFirstUniqueInString {
    static int getUnique(String str) {
        int[] frequency = new int[26];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string in lowercase ");
        String str = s.next();
        System.out.println("Index of first unique character in string is : " + getUnique(str));
    }
}
