import java.util.Scanner;

public class Rotate_Array {
    static int[] rotate_array(int[] arr,int k){
        int j=0;
        int n= arr.length;
        k = k % n;
        int[] ans=new int[n];
        for (int i = n-k; i <n ; i++) {
            ans[j++]=arr[i];

        }

        for (int i = 0; i <n-k ; i++) {
            ans[j++]=arr[i];

        }

        return ans;
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n= input.nextInt();
        System.out.println("Enter " + n + " Elements : ");
        int[] arr =new  int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= input.nextInt();
        }

        System.out.println("Enter K : ");
        int k= input.nextInt();

        int[] ans=rotate_array(arr,k);

        System.out.println("After rotation Array : ");
        printArray(ans);



    }
}
