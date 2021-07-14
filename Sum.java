import java.util.Scanner;
public class Sum {
    public static void main(String[] args)
    {
        int sumofeven=0,sumofodd=0,sum=0;
        System.out.println("Enter Number: ");
        Scanner ob=new Scanner(System.in) ;
        int num= ob.nextInt();
        for(int i=0;i<=num;i++)
        {
            sum=sum+i;
            if(i%2==0)
            {
                sumofeven=sumofeven+i;
            }
            else{
                sumofodd=sumofodd+i;
            }
        }
        System.out.println("Total Sum: "+sum);
        System.out.println("Sum of Even: "+sumofeven);
        System.out.println("Sum of odd: "+sumofodd);
    }
}
