import java.util.Scanner;

public class PrefixBasedProblem {

    static  void PrefixArraySum_Inplace(int[] arr){
        int n= arr.length;

        for (int i = 1; i < n; i++) {
            arr[i]=arr[i-1]+arr[i];
        }

    }

    static int[] PrefixArraySum(int[] arr){
        int n=arr.length;
        int[] pref_arr=new int[n];
        pref_arr[0]=arr[0];
        for (int i = 1; i < n; i++) {
            pref_arr[i]=pref_arr[i-1]+arr[i];
        }
        return pref_arr;
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n= input.nextInt();

        System.out.println("Enter Array Elements : ");

        int[] arr=new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= input.nextInt();
        }

        System.out.println("Original Array : ");
        printArray(arr);

        System.out.println("Prefixed Array : ");

//       int[] pref_arr= PrefixArraySum(arr);

        PrefixArraySum_Inplace(arr);
        printArray(arr);





    }
}
