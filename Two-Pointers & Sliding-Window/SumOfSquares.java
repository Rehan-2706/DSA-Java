import java.util.*;
public class SumOfSquares {

    static boolean getSquares(int c){
        long result=0;
        long left=0;
        long right=(int)Math.sqrt(c);

        while(left<=right){
            result=(left*left)+(right*right);
            if(result==c) return true;
            else if(result>c) right--;
            else left++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check whether the square of two numbers equals to that number");
        int c=s.nextInt();
        if(getSquares(c))
        {
            System.out.println("The Squares of other 2 numbers equals to "+c);
        }
        else{
            System.out.println("The Squares of other 2 numbers does not equals to "+c);
        }
    }
}
