import java.util.Scanner;

public class Frequency_Array {
   static int[] makeFrequencyArray(int[] arr){
       int[] freq=new int[100005];
       for (int i = 0; i < arr.length; i++) {
           freq[arr[i]]++;
       }

       return  freq;

   }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter Array Size : ");
        int n= input.nextInt();

        System.out.println("Enter Array Elements : ");

        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
             arr[i]= input.nextInt();
        }

        int [] freq=makeFrequencyArray(arr);

        System.out.println("Enter Query Size : ");
        int q= input.nextInt();

        while(q>0){
            System.out.println("Enter number to be Searched : ");
            int x= input.nextInt();
            if (freq[x]>0) {
                System.out.println("yes");

            }else {
                System.out.println("No");
            }
           q--;
        }

    }
}
