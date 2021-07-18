public class MultipleInheritance {
    public static void main(String[] args)
    {
        Multi obj=new Multi();
        obj.display();
        obj.show();
    }
}
interface  Fbc{
    void show();
}
interface  Xyz{
    void display();
}
class Multi implements Fbc,Xyz{
   public void show()
   {
       System.out.println("Im show");
   }
   public void display()
   {
       System.out.println("Display");
   }
}
