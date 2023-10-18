import java.util.Scanner;

public  class Array_ref_2 {
    static void Print_Array(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
    static  void Copied_Array(int[] arr2){
        arr2[0]=0;
        arr2[1]=0;

        for (int i = 0; i < arr2.length; i++) {
            System.out.println( "copied array : " + arr2[i]);

        }
    }
    static void Change_Array(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []arr={1, 2,3,4,5};
        System.out.println("Original Array : ");
        Print_Array(arr);

        int []arr2=arr.clone();  // USE FOR COPY ARRAY TO ANOTHER ARRAY 
        System.out.println("copied arr2 after changing arr ");
        Copied_Array(arr2);

        System.out.println("After change Array : ");
        Change_Array(arr);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}