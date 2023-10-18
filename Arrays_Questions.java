import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Questions {



static int[] smallestAndLargestElements(int[] arr) {
    Arrays.sort(arr);
    int[] ans = {arr[0],arr[arr.length-1]};
    return ans;
}
    static boolean isSorted(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;

            }
        }
        return check;
    }


    static int Count_Occurrence_Strictly_Greater(int[] arr,int a){

        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > a) {
                count++;
            }

        }
        return count;
    }
    static int Last_Occurences(int[] arr,int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex=i;
            }
        }
        return lastIndex;
    }
    static int Element_Occurrence(int[] arr,int x){

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== x) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n= input.nextInt();
        System.out.println("Enter the Array elements : ");
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]= input.nextInt();

        }
//        System.out.println("Enter the Occurrences Element : ");
//        int x= input.nextInt();
//        System.out.println( " NUmber of Occurrences Of x : " + Element_Occurrence(arr,x));
//        System.out.println("Last Occurrence Of X : " + Last_Occurences(arr,x));
//        System.out.println("Count Number Strict greater Than of X : " + Count_Occurrence_Strictly_Greater(arr,x));
//        System.out.println("is sorted : " + isSorted(arr));

        int[] ans= smallestAndLargestElements(arr);
        System.out.println("smallest element : " + ans[0]);
        System.out.println("Largest element : " + ans[1]);

    }
}
