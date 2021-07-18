public class Thiskeyword {
    public static void main(String ... args)
    {
        Calc c=new Calc();
        c.Add(50,10);
        System.out.println(c.num1);
    }
}
class Calc{
    int num1;
    int num2;
    public void Add(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
}
