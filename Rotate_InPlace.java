import java.util.Scanner;

public class Rotate_InPlace {
    static void reverse(int[] arr,int i,int j){
        while (i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        }

    }

    static void Reverse_InPlace(int[] arr,int k){
         int n= arr.length;
         k=k % n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0, n-1);

    }
    static  void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    static void swapArray(int[] arr ,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size : ");
        int n= input.nextInt();
        System.out.println("enter " + n + " elements :");
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= input.nextInt();
        }

//        System.out.println("Original array :");
//        printArray(arr);

        System.out.println("enter k : ");
         int k= input.nextInt();
        Reverse_InPlace(arr,k);
        System.out.println("Array after Roration : ");
        printArray(arr);


    }
}
