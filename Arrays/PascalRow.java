import java.util.Scanner;

public class PascalRow {

    static void printRow(int row) {

        long ans = 1;
        System.out.print(ans + " ");

        int n = row - 1;

        for (int i = 1; i <= n; i++) {
            ans = ans * (n - i + 1);
            ans = ans / i;

            System.out.print(ans + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row number: ");
        int row = sc.nextInt();

        printRow(row);
    }
}