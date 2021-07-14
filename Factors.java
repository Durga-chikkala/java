public class Factors {
    public static void factors(int x) {
        int index = 0;
        int[] arr = new int[20];
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                arr[index] = i;
                index = index + 1;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        factors(20);
    }
}
