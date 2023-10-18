import java.util.Scanner;

public class Equal_Partition_Sum {


    static int  findArraySum(int[] arr){
        int n= arr.length;
        int totalSum=0;
        for (int i = 0; i <n ; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean EqualSumPartition(int[] arr){
        int totalSum=findArraySum(arr);
        int prefxSum=0;
        for (int i = 0; i < arr.length; i++) {
            prefxSum += arr[i];
            int suffixSum=totalSum-prefxSum;
            if (suffixSum == prefxSum) {
                return true;

            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Array Size : ");

        int n=in.nextInt();

        System.out.println("Enter Array Elements : ");

        int[] arr=new int[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=in.nextInt();
        }


        System.out.println("Equal Partition possible : " + EqualSumPartition(arr));


    }
}
