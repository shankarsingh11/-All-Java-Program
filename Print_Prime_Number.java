import java.util.Scanner;

public class Print_Prime_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a range : ");
        int n = in.nextInt();

        for (int i = 2; i <=n ; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    count++;
            }
            if(count == 0){
                System.out.println(i+ " ");
            }
        }

    }
}
