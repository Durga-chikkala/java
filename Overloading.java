public class Overloading
{
	public static void main(String [] args)
	{
	      	A obj=new A();
 	      	obj.show(5);
		obj.show();
	}
}
class A
{
	public void show()
	{
		System.out.println("No parameter is passed");
	}
	public void show(int i)
	{
		System.out.println("parameter is passed "+i);
	}
}
//basing on parameters the function call is changing this is called as function overloading 
