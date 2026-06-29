public class pattern19 {
    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int i = 0; i < n; i++) {

            // Left stars
            for (int j = n - 1; j >= i; j--) {
                System.out.print("*");
            }

            // Spaces
            for (int s = 0; s < 2 * i; s++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = n - 1; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 0; i < n; i++) {

            // Left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int s = 0; s < 2 * (n - i - 1); s++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}