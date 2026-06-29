import java.util.*;
public class functions {
    // public static void printavg(Scanner s){
    //     double d1,d2,d3,avg;
    //     d1=s.nextDouble();
    //     d2=s.nextDouble();
    //     d3=s.nextDouble();
    //     avg=(d1+d2+d3)/3.0;
    //     System.out.println("Average : "+avg);
    // }
    //    public static void printsum(Scanner s){
    //     int n,sum=0;
    //     System.out.println("Enter the value of n");

    //     n=s.nextInt(); 
    //     for(int i=1;i<=n;i+=2){
    //         sum+=i;
    //     }
    //     System.out.println("Sum of first n odd numbers is : "+sum);
    //   }
    //     public static void fingGreatest(Scanner s){
    //     int n1,n2;
    //     n1=s.nextInt();
    //     n2=s.nextInt();
    //     if(n1>n2){
    //         System.out.println("Number 1 is greatest");
    //     }
    //     else if(n2>n1){
    //         System.out.println("Number 2 is greatest");
    //     }
    //     else{
    //         System.out.println("Both are equal");
    //     }
    //   }
    //      public static void calculateCircumference(Scanner s){
    //         double r;
    //         r=s.nextDouble();
    //         double circumference=2*3.14*r;
    //         System.out.println("Circumference of circle: "+circumference);
    //   }
    //  public static void checkEligibility(Scanner s){
    //        int age;
    //        age=s.nextInt();
    //        if(age<=0){
    //         System.out.println("Invalid age");
    //        }
    //        else if(age>=18){
    //         System.out.println("Eligible to vote");
    //        }
    //        else{
    //         System.out.println("not eligible to vote");
    //        }
    //   }
    // public static void printInfinite(){
    //     int i=1;
    //      do{
    //         System.out.println("hello");
    //      }while();
    //   }
    //   public static void checkSign(Scanner s){
    //     int n;
    //     int ch=1;
    //     int p=0,ne=0,z=0;
    //     System.out.println("Enter 1 for continue");
    //     while (ch==1) {
    //         n=s.nextInt();
    //         if(n>0){
    //             p++;
    //         }else if(n<0){
    //             ne++;
    //         }else
    //         {
    //             z++;
    //         }
    //         ch=s.nextInt();
    //     }
    //     System.out.println("Positive = "+p+"\n Negetive = "+ne+"\nZeros="+z );
    //   }
    //  public static void computePower(Scanner s){
    //     int n1,n2;
    //     n1=s.nextInt();
    //     n2=s.nextInt();
    //     int pow=1;
    //      for(int i=1;i<=n2;i++){
    //          pow=pow*n1;
    //      }
    //     System.out.println("power : "+pow);
    //   }
    // public static void printFibo(Scanner s){
    //     int n;
    //     int f1=0,f2=1;
    //     int f3;
    //     System.out.println("Enter number of terms you want to print");
    //     n=s.nextInt();
    //     System.out.println(f1);
    //     System.out.println(f2);
    //     for(int i=1;i<=n-2;i++){
    //         f3=f1+f2;
    //         System.out.println(f3);
    //         f1=f2;
    //         f2=f3;
    //     }
    // }
    //     public static void calculateGcd(Scanner s){
    //     int n1,n2;
    //     n1=s.nextInt();
    //     n2=s.nextInt();
    //     int temp;
    //         while(n2!=0)
    //         {
    //             temp=n2;
    //             n2=n1%n2;
    //             n1=temp;
    //         }
    //         System.out.println("GCD : "+n1);
    // }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        // printavg(s);
        // printsum(s);
        // fingGreatest(s);
        // calculateCircumference(s);
        // checkEligibility(s);
        // printInfinite();
        // checkSign(s);
        //  computePower(s);
        // printFibo(s);
        // calculateGcd(s);
    }
}
