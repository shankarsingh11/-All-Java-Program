import java.util.Arrays;

public class ColNoFixed {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,4,5,6,7,8},
                {5,6,8,9},
                {10,3,7,9,0},
        };
// output first method

//        for (int row=0;row< arr.length;row++){
//            for (int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }

        // output second method
//
//        for (int row=0;row< arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // output third method

        for (int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
