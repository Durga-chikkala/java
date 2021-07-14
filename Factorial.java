public class Factorial {
    public static int  factorial( int x)
    {
        int mul=1;
        int i=x;
        while(i>0)
        {
            mul=mul*i;
            i=i-1;
        }
        return mul;
    }
    public static void main(String ... args)
    {
        System.out.println(factorial(6));
    }
}
