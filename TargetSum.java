import java.util.Scanner;

public class TargetSum {
    static int Triple_Target_Sum(int[] arr){
        int n=arr.length;
        int target=8;
        int count=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n-1; k++) {
                    if (arr[i]+arr[j]+arr[k] == target) {
                        count++;

                    }

                }

            }

        }
        return count;
    }

    static int target_Sum(int[] arr){
        int n=arr.length;
        int target=7;
        int count=0;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n-1; j++) {
                if (arr[i]+arr[j] == target) {
                    count++;

                }

            }


        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n= input.nextInt();
        System.out.println("Enter the Array Elements : ");
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]= input.nextInt();

        }

        System.out.println("number of target sums : " + target_Sum(arr));

        System.out.println("Number of Triplet target sum : " + Triple_Target_Sum(arr));

    }
}
