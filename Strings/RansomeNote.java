import java.util.*;

public class RansomeNote {

    static boolean checkRansom(String ransomNote, String magazine) {
        int frequency[] = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            frequency[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (frequency[ransomNote.charAt(i) - 'a'] == 0) {
                return false;
            }
            frequency[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two strings i.e. RansomNote and magazine");
        String ransomNote = s.next();
        String magazine = s.next();
        boolean b = checkRansom(ransomNote, magazine);
        if (b) {
            System.out.println("RansomNote Can be constructed using the letters of magazine");
        } else {
            System.out.println("RansomNote Cannot be constructed using the letters of magazine");

        }
    }
}
