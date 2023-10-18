
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = in.nextInt();
        int a = n;
        int count = 0;
        while (n != 0){
              n = n / 10;
                 count++;
        }

        int b = a;
        int sum  =  0;
        while (a != 0){
              int digit = a % 10;
              a = a / 10;

              int prod = 1;
            for (int i = 1; i <= count ; i++) {
                       prod *= digit;
                        sum = sum + prod;
            }

        }

        if (sum == b){
            System.out.println("this number is armstrong : ");
        }
        else {
            System.out.println("this number is not armstrong : ");
        }

    }
}
