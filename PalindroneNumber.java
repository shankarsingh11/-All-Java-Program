import java.util.Scanner;

public class PalindroneNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number : ");
        int n = in.nextInt();
        int a = n;
        int revrse= 0;
        while (n!=0){
            int digit = n % 10;
            n = n / 10;
            revrse = revrse*10+digit;
        }
        if (revrse == a){
            System.out.println("this number is palindrome number  : ");
        }
        else {
            System.out.println("this number is not palindrome number : ");
        }
    }
}
