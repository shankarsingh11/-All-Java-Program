import java.util.Scanner;

public class Advanced_Problem_Array {

    static void sortedZeroesAndOnes(int[] arr){

        int Zeroes=0;
        int n= arr.length;


        for (int i = 0; i <n ; i++) {

            if (arr[i] ==0) {
                Zeroes++;

            }

        }

        // 0 to Zeroes-1:0 , Zeroes to n-1:=1
        for (int i = 0; i < n; i++) {

            if ( Zeroes>i) {
                arr[i]=0;

            } else {
              arr[i]=1;
            }

        }

    }

         static void swap(int[] arr ,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n= input.nextInt();

        System.out.println("Enter the Array elements : ");
        int [] arr=new int[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]= input.nextInt();
        }

        System.out.println("Original Array : ");
        printArray(arr);

        System.out.println("Sorted Array : ");
           sortedZeroesAndOnes(arr);
        printArray(arr);

    }
}
