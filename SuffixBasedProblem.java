import java.util.Scanner;

public class SuffixBasedProblem {

    static int[] makeSuffixSumArray(int[] arr){
        int n= arr.length;
        arr[n-1]=arr[n-1];
        for (int i = n-2; i >= 0 ; i--) {

            arr[i] += arr[i]+arr[n-1];

        }
        return arr;
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
        int n= input.nextInt();

        System.out.println("Enter Array Elements : ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= input.nextInt();
        }

        System.out.println("Original Array : ");
        printArray(arr);

        int[] ans=makeSuffixSumArray(arr);
        System.out.println("Suffix Array : ");
        printArray(ans);

    }
}
