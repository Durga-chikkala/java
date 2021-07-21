public class Exceptionclass {
    public static void main(String[] args)
    {
        int i,j,k=0;
        i=10;
        j=0;
        try{
            k=i/j;
        }
        catch(Exception e)
        {
            System.out.println("cannot divide with zero");
        }
    }
}
