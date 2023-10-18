import java.util.Scanner;

public class Count_Digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = in.nextInt();
        int countDigit =  0;
        while (n!=0){
            n = n / 10;
            countDigit++;
        }
        System.out.println("Digit is : " + countDigit);
    }
}
