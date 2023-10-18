import java.util.Scanner;

public class RangeQuery{


    static int[]  makePrefixSumArray(int[] arr){
        int n= arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] += arr[i-1];
        }

       return arr;

    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Array Size: ");

        int n = in.nextInt();

        System.out.println("Enter Array Elements : ");

        int[] arr = new int[n+1];

        for (int i = 1; i <=n; i++) {
            arr[i] = in.nextInt();
        }

        int[] prefSum = makePrefixSumArray(arr);


        System.out.println("Enter Number of The  Query : ");
        int q = in.nextInt();

        while (q-- > 0) {
            System.out.println("Enter the Range : ");
            int l = in.nextInt();
            int r = in.nextInt();
            int ans = prefSum[r] - prefSum[l-1];

            System.out.println("Sum : " + ans);
        }
    }
}
