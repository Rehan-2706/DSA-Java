import java.util.*;
public class CountDigits {
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number to count the digits");
    int num=s.nextInt();
    int count=0;
       if(num==0)
    {
        count=1;
    }
 else{
    num=Math.abs(num);
    while (num>0) {
        count++;
        num=num/10;
    }

}
    System.out.println(count);
}  
}
