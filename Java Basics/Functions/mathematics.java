import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class mathematics {
//    public static void digits(Scanner s){
//     int n=s.nextInt();
//     int digit;
//     while (n!=0) {
//         digit=n%10;
//         System.out.println(digit);
//         n=n/10;
//     }
//}

//    public static void countDigits(Scanner s){
//     int n=s.nextInt();
//     int digit;
//     int c=0;
//     while (n!=0) {
//         digit=n%10;
//         c++;
//         n=n/10;
//     }
//     System.out.println("Digit count : "+c);
// }
//    public static void reverseDigits(Scanner s){
//     int n=s.nextInt();
//     int digit,reverse=0;
//     while (n!=0) {
//         digit=n%10;
//         reverse=(reverse*10)+digit;
//         n=n/10;
//     }
//     System.out.println("Digits in reverse : "+reverse); O(log10(n)) com
// }
// public static void checkPalindrome(Scanner s){
//     int n=s.nextInt();
//     int digit,reverse=0;
//     int temp=n;
//     while (n!=0) {
//         digit=n%10;
//         reverse=(reverse*10)+digit;
//         n=n/10;
//     }
//     if(temp==reverse)
//     System.out.println("Number is palidrome");
//     else
//     System.out.println("Number is not plaindrome");
// }
// public static void checkArmstrong(Scanner s){
//     int n=s.nextInt();
//     int digit;
//     double sum=0;
//     int temp=n;
//     while (n>0) {
//         digit=n%10;
//     sum=sum+Math.pow(digit, 3);
//         n=n/10;
//     }
//     if(temp==sum)
//     System.out.println("Number is Armstrong");
//     else
//     System.out.println("Number is not Armstrong");
// }
// public static void printDivisors(Scanner s){
//     int n=s.nextInt();
//     List<Integer> li=new ArrayList<>();
//     System.out.println("Divisors are: ");

//     for(int i=1;i<=Math.sqrt(n);i++){
//         if(n%i==0){
//             li.add(i);
//             if(n/i!=i){
//                 li.add(n/i);
//             }
//         }

//     }
//     Collections.sort(li);
//     for(int x:li){
//         System.out.println(x);
//     }
// }
public static void checkPrime(Scanner s){
    int n=s.nextInt();
    int c=0;
    for(int i=1;i*i<=n;i++)
    {
        if(n%i==0)
        {
            c++;
            if(n/i!=i)
            c++;
        }
    }
    if(c==2)
    {
        System.out.println("Number is prime");
    }
}

    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        // digits(s);
        // countDigits(s);
        // reverseDigits(s);
        // checkPalindrome(s);
        // checkArmstrong(s);
        // printDivisors(s);
        checkPrime(s);
        
    }
}
