/* Here we are having same i variable in both parent class and child class then normally the i value will the child value of i but when we 
use super.i then the parent class i will be the value of i in this we can apply same logic  for functions too*/
class Supervariable
{
	public static void main(String[] args)
	{
		B obj=new B();		

	}
}
class A 
{
	int i=5;
	A()
	{
		System.out.println("A cons");
	}
	A(int i)
	{
		System.out.println(i);
	}
}
class B extends A
{
	int i=10;
	B()
	{
		System.out.println("B cons"+super.i);
	}
	B(int i)
	{
		super(i);
		System.out.println("B cons"+super.i);
	}
}
