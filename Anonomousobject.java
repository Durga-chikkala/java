/*Anonymous objects will not have any name to the object and this is used when we want to call a function or variable  from a class only once 
and this reduces the space since we are not creating any reference to the created object*/
class Anonomousobject
{
	public static void main(String ... args)
	{
		new A().show();
	}
}
class A
{
	public void show()
	{
		System.out.println("Object is called");
	}
}
