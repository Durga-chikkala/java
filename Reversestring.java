public class Reversestring {
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

    public static void main(String[] args) {
         System.out.println(reverse("Durga"));
    }
}
