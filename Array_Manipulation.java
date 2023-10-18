import java.util.Scanner;

public class Array_Manipulation {

    static int FirstSmallestNumber(int [] arr){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] <min) {
                min=arr[i];
            }
        }
        return  min;
    }

    static int Second_Smallest_number(int [] arr){
        int min=FirstSmallestNumber(arr);
        int n= arr.length;
        for (int i = 0; i < n; i++) {

            if (arr[i] ==min) {
                arr[i]=Integer.MAX_VALUE;

            }
        }
        int secondMin=FirstSmallestNumber(arr);
        return secondMin;
    }

    static int First_Repeated_Value(int[] arr){

        int n= arr.length;
        for (int i = 0; i <n; i++) { //first number
            for (int j = i+1; j <n ; j++) { // second number
                if (arr[i] == arr[j]) {  // found number
                    return  arr[i];  // here code is ended
                }
            }
        }
       return  -1;
    }

    static int findFirstMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i]> max) {
                max=arr[i];
            }

        }
        return max;
    }
    static int findSecondMax(int[] arr){

        int max=findFirstMax(arr);
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i]==max) {
                arr[i]=Integer.MIN_VALUE;
            }
        }

       int Second_Max=findFirstMax(arr);
        return Second_Max;
    }

    static int findUnique(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;

                }

            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++)
        {
            if (arr[i]>0) {
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n=input.nextInt();
        System.out.println("enter the elements of Array : ");
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= input.nextInt();
        }
//        System.out.println("Unique elements :" + findUnique(arr));
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

//        System.out.println("fistMax :" + findFirstMax(arr));
//
//        System.out.println("second Max : " + findSecondMax(arr));

       // System.out.println("first repeating  number : " + First_Repeated_Value(arr));

        System.out.println("first smallest number : " + FirstSmallestNumber(arr));

        System.out.println(" second smallest number : " + Second_Smallest_number(arr));



    }
}
