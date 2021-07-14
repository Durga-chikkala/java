import java.util.Scanner;

public class Fibanoic {
    public static void main(String ... args) {
        int n1 = 0, n2 = 1,n3, i;
        System.out.println("Enter count");
        Scanner ob=new Scanner(System.in);
        int count = ob.nextInt();
        System.out.print(n1+" "+n2);
        for(i=2;i<count;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        }
    }
}
