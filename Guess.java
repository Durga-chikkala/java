import java.util.Scanner;
class Guess
{
	public static void main(String[] args)
	{
		int a;
		int count=0;
		a=(int)Math.floor(Math.random()*11);
		Scanner obj=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your Guess");

			int num=obj.nextInt();
			if(num==a)
			{
				System.out.println("you won");
				if(count<=3)
				{
					System.out.println("You have Good Guessing Power");
				}
				else if(count<=5)
				{

					System.out.println("You have Medium Guessing Power");
				}
				else
				{

					System.out.println("You have weak Guessing Power");
				}
				break;
			}
			else
			{
				System.out.println("Try Again");
				count++;
			}
		}
	}
}
			

		