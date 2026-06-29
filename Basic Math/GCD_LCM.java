import java.util.Scanner;

public class GCD_LCM {

    static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int gcdValue = gcd(a, b);
        int lcmValue = lcm(a, b);

        System.out.println("GCD = " + gcdValue);
        System.out.println("LCM = " + lcmValue);

        sc.close();
    }
}