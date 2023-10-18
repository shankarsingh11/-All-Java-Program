
import java.util.Scanner;

public class Array_reference {
    static void change_array(int []arr3){
        for (int i = 0; i < arr3.length; i++) {
            arr3[i]=0;

        }
        System.out.println("print the elements after calling function : " +  arr3);

    }
    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i] + " ");
        }

         System.out.println();
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=input.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();

        }
        int[]arr_2=arr;
        System.out.println("Print the copied array elements : ");
        printArray(arr);
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("print array elements after changes the elements arr: ");
        printArray(arr);
        System.out.println("print array elements after chnages the elements arr2 : ");
        printArray(arr_2);
        System.out.println("enter the elements of arr3 : ");
        int[] arr3 = new int[5];
        arr3 [0]=1;
        arr3[1]=2;
        arr3[2]=3;
        arr3[3]=4;
        arr3[4]=5;
        System.out.println("print the arr3 elements : " +  arr3);
        change_array(arr3);


    }
}
