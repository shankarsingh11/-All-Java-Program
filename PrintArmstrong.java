import java.util.Scanner;

public class PrintArmstrong {

    // function for count a digits
    static  int count_Digits(int n){
        int count = 0;
        while (n !=0){
              n = n /10;
              count++;
        }
       return count;
    }
    // function for power
    static int  pow(int base,int exp){
        int powerValue = 1;
        for (int i = 1; i <= exp ; i++) {
            powerValue = powerValue * base;
        }

        return powerValue;
    }

    static void isArmstrong(int n){
        int exp = count_Digits(n);
        int copyNum = n;
        int remainder = 0;
        int sum = 0;

        while (copyNum!=0){
        remainder = copyNum%10;
        copyNum = copyNum/10;
        sum += pow(remainder,exp);
        }

        if (sum == n) {
            System.out.println("Armstrong number ");

        }else {
            System.out.println("not armstrong ");
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
       int count= count_Digits(n);
        pow(n,count);
        isArmstrong(n);
    }
}
