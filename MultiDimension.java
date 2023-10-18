import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
           1 2 3
           4 5 6
           7 8 9
        */

        // Syntax

        // int [][] arr=new int[3][3]; // colom is not mendatory

//        int[][] arr={
//                {1 ,3,4},// 0th index
//                {5,6,7},// 1th index
//                {8,9,2}, // 2nd index
//        };
        Scanner in=new Scanner(System.in);

        int [][] arr=new int[3][3];
        System.out.println(arr.length);// now of rows

        System.out.println("enter the input element");
//  input
        for (int row=0;row< arr.length;row++){

            // for each col  in every row

            for (int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }
//// output first method
//        for (int row=0;row< arr.length;row++){
//            // for each col  in every row
//
//            for (int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }


        // output  second  method

//        for (int row=0;row< arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //  output third method

       for (int[] a:arr){
           System.out.println(Arrays.toString(a));
       }
    }
}
