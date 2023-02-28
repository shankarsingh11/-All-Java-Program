import java.util.Scanner;

public class BinaryToDecimal{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int binary_num=sc.nextInt();
        int jp=1;//2^0=1 power of 2
        int ans=0;// converted a decimal number
        while(binary_num>0){
            int unit_digit=(binary_num%10);
           ans+=(unit_digit*jp);
           binary_num/=10;
         jp*=2;
        }
        System.out.println(ans);
    }
}