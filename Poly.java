class Poly
{
	public static void main(String[] args)
	{
		B obj=new B();
		obj.show();
	
	}
}
class A{
	public void show()
	{
		System.out.println("A fun");
	}
}
class B extends  A
{	
	public void show()
	{
		System.out.println("B fun");
	}
}
// the show function is overwritting the show function in B is overwritting the show function in A it is called as function overridding.
