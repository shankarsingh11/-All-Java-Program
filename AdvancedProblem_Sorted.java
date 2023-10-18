import java.util.Scanner;

public class AdvancedProblem_Sorted {

    static void sortZeroesAndOnes(int[] arr){
        int n= arr.length;
        int left=0;
        int right=n-1;
        while (left<right){
            if (arr[left] == 1 && arr[right]==0) {
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
               left++;
            }
            if (arr[right] ==1) {
                right--;
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
        sortZeroesAndOnes(arr);
        printArray(arr);
    }
}
