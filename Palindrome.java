import java.util.Scanner;
public class Palindrome {
    static String reverse(String x)
    {   String reverse="";
        int i=x.length()-1;
        while(i>=0)
        {
            reverse=reverse+x.charAt(i);
            i=i-1;
        }
        return reverse;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter Word: ");
        Scanner ob=new Scanner(System.in);
        String word=ob.nextLine();
        if(word.equals(reverse(word)))
        {
            System.out.println("Palindrome ");
        }
        else{
            System.out.println("not Palindrome");
        }
    }
}
