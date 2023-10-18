import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        int bal  = 0;
        int currentAmount = 0;

        while (true){
            System.out.println("1.press one check balance : ");
            System.out.println("2.press two check deposit : ");
            System.out.println("3.press three check withdraw : ");
            System.out.println("4.press four check currentamount : ");
            int n = input.nextInt();
            switch (n){
                case 1:
                {
                    System.out.println("Current balance is : " + bal);
                    break;

                }
                case 2:
                {

                    System.out.println("enter the deposit amount : ");
                    int amount= input.nextInt();
                    bal = bal + amount;
                    break;


                }
                case 3:
                {
                    System.out.println("enter the withdraw amount : ");
                    int withdraw = input.nextInt();

                    if(withdraw <= bal)
                    {
                         currentAmount = bal - withdraw;
                    }else {
                        System.out.println(" Not sufficient amount  ");
                    }
                    break;


                }
                case 4 :
                {
                    System.out.println("Current balance is : " + currentAmount );
                    break;
                }
                default:
                {
                    System.out.println("wrong choice : ");

                }
            }
        }

    }
}
