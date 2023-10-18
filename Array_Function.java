import java.util.Arrays;

public class Array_Function {
    static void Original_arr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
    static void Copied_Array(int[] arr2){
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

        }
    }
    static void Change_Array_Elements(int[] arr_2){
        arr_2[0]=0;
        arr_2[1]=0;
        for (int i = 0; i < arr_2.length ; i++) {
            System.out.println(arr_2[i]);

        }
    }
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5};
        System.out.println("Original Array Elements : ");
        Original_arr(arr);

        // Trying to copy arr to arr_2

       // int[] arr_2=arr.clone();  // Cloning of Array function

        //int[] arr_2= Arrays.copyOf(arr,arr.length);  // Array copy function

        //int[] arr_2=Arrays.copyOf(arr,2);// only two elements prints

       // int[] arr_2=Arrays.copyOfRange(arr,0,arr.length);

        int[] arr_2=Arrays.copyOfRange(arr,1,3);  // indexed based ,from 0 to n-1 print



        System.out.println("After Copied Arr_2 : ");
        Copied_Array(arr_2);
        System.out.println("After Chnages The Array Elements : ");
        Change_Array_Elements(arr_2);
    }
}
