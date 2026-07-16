import java.util.*;
public class PascalsTriangle {

    static List<Integer> getRows(int rows)
    {
        List<Integer>list= new ArrayList<>();

        list.add(1);
        long result=1;
        for(int i=1;i<rows;i++)
        {
            result=result*(rows-i);
            result=result/i;
            list.add((int)result);
        }
        return list;
    }

    static List<List<Integer>> printPascal(int rows)
    {
        List<List<Integer>> answer=new ArrayList<>();

        for(int i=1;i<=rows;i++)
        {
            answer.add(getRows(i));
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of rows to print ");
        int rows=s.nextInt();
        List<List<Integer>> answer = printPascal(rows);

        for(List<Integer> row:answer)
        {
            System.out.println(row);
        }
    }
}
