import java.util.*;
class JustOneMismatch{
    static String mismatch(String arr[],String key)
    {

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()==key.length())
            {
                 int count=0;
                for(int j=0;j<arr[i].length();j++)
                {
                    if(arr[i].charAt(j)!=key.charAt(j))
                        count++;
                }
                if(count==1)
                {
                    return arr[i];
                }
            }
            
        }
        return "No mismatch found";
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String key=s.nextLine();
        String arr[]={"baa","abb","banaba","bacaa"};
        String answer=mismatch(arr,key);
        System.out.println("Answer = "+answer);

    }
}