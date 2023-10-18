import java.util.Scanner;

public class Digit_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = in.nextInt();
        int sum = 0;
        while (n!=0){
            int lastDigit = n % 10 ;
            n = n / 10;
            sum += lastDigit;
        }
        System.out.println("Sum is : " + sum);
    }
}
