class First_Recursion{

    static void printname(int count)
    {
       
        if(count==5)
            return;
        System.out.println("Rehan");
        count++;
        printname(count);

    }
    public static void main(String[] args) {
         int count=0;
        printname(count);
    }
}