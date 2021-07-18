class Abstract {
    public static void main(String[] args)
    {
        Phone obj=new Android();
        obj.call();
        obj.touch();
    }
}
abstract class Phone
{
   public void call()
    {
        System.out.println("calling...");
    }
    public abstract void touch();
   public abstract  void games();

}
class Android extends Phone{
    public void touch()
        {
            System.out.println("touching");
        }
    public  void games()
    {
        System.out.println("gaming");
    }
}
