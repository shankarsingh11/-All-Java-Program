import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i <n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }



    }
}
