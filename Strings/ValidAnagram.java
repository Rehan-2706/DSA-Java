import java.util.*;

public class ValidAnagram {
    static boolean isAnagram(String s1, String s2) {
        int frequency[] = new int[26];
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            frequency[s1.charAt(i) - 'a']++;
            frequency[s2.charAt(i) - 'a']--;
        }
        for (int count : frequency) {
            if (count != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string s1 and s2");
        String s1 = s.next();
        String s2 = s.next();

        if (isAnagram(s1, s2)) {
            System.out.println("s2 is valid anagram of s1");
        } else {
            System.out.println("s2 is not a valid anagram of s1");
        }
    }
}
