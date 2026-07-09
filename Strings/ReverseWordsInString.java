import java.util.Scanner;

public class ReverseWordsInString {
    static String reverse(String str) {
        char[] arr = str.toCharArray();

        int start = 0;
        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reversestr(arr, start, end - 1);
                start = end + 1;
            }
        }
        return new String(arr);
    }

    static void reversestr(char[] arr, int start, int end) {
        while (start <= end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string containing multiple words");
        String str = s.nextLine();
        System.out.println("Original String : " + str);
        System.out.println("String after Reverse : " + reverse(str));

    }
}
