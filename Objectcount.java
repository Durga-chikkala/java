class Objectcount
{
	public static void main(String[] args)
	{
		
		A obj=new A();
		A obj1=new A();
		A obj2=new A();
		A obj3=new A();
                A.counter();
	}
}
class A{
	public int i=10; 
	public static int count;
	public A()
	{
	 	count++;
	}
	public static void counter()
	{
		System.out.println(count);
	}
}
