import java.util.Scanner;

public class Check_Prime_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = in.nextInt();

        for (int i = 2 ; i < n ; i++){
            if (n % i == 0){
                System.out.println("Not prime number : ");
                break;
            }
            else {
                System.out.println("prime number : ");
                break;
            }

        }

    }
}
