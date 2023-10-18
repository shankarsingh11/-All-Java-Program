import java.util.Scanner;

public class Take_Input {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Array size : ");
        int n=input.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the " + n + "array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr [i]=input.nextInt();

        }
        System.out.println("Print the array elements : ");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }

    }
}













