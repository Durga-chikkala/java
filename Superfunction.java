/*Super function will call the constructor of parent class by default the super class will be executed 
and if you want to call explicitly also we can call then we call the parameter constructor of A */
class Superfunction
{
	public static void main(String[] args)
	{
		B obj=new B(5);		

	}
}
class A 
{
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
	B()
	{
		System.out.println("B cons");
	}
	B(int i)
	{
		super(i);
		System.out.println("B cons"+i);
	}
}
