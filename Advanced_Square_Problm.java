import java.util.Scanner;

public class Advanced_Square_Problm {


    static int[] sortedSquareArray(int[] arr){

        int n= arr.length;

        int left=0;

        int right=n-1;

        int k=n-1;

        int[] sq_arr=new int[n];

        while (left <= right){

            if (Math.abs(arr[left]) > Math.abs(arr[right])) {  // abs means abstruct value base camparison

                sq_arr[k--] = arr[left] * arr[left];

                left++;

            }else {

                sq_arr[k--] = arr[right] * arr[right];

                right--;
            }

        }

        return sq_arr;
    }
    static void printArray(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+ " ");
        }

        System.out.println();
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter Array Size : ");

        int n=input.nextInt();

        System.out.println("Enter the Array Elements :");

        int[] arr= new int[n];

        for (int i = 0; i < arr.length; i++) {

            arr[i]=input.nextInt();
        }

        System.out.println("Original Array :");

        printArray(arr);

        int[] sq_arr=sortedSquareArray(arr);

        System.out.println("Sorted Array : ");

        printArray(sq_arr);

    }
}
