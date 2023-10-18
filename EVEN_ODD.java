import java.util.Scanner;

public class EVEN_ODD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a range  number : ");
        int startRange = input.nextInt();
        int endRange = input.nextInt();

        for (int i = startRange; i <= endRange ; i++) {
            if (i % 2 == 0){
                System.out.println("Even number : " + i);
            }else {
                System.out.println("Odd number : " + i);
            }
        }
    }
}
