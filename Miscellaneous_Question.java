import java.util.Scanner;

 public class Miscellaneous_Question{

     static int[] Reverse_Array(int[] arr){
         int n= arr.length;
         int j=0;
         int[] ans=new int[n];
         // Traverse the Original Array in Reverse Direction

//         for (int i =n-1; i >=0 ; i--) {
//             ans[j++]=arr[i];
//         }
         int i=n-1;
         while (i>=0){
             ans[j++]=arr[i];
         }

        return ans;
     }

     static void PrintArray(int[] arr){
         for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]);
         }
     }

  static  void swapWithoutTemp(int a,int b){
      System.out.println("Value before swap : ");
      System.out.println("a : "+ a);
      System.out.println("b : " + b);
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("Value After Swap : " );
      System.out.println("a : " + a);
      System.out.println("b : " + b);
  }
     static  void swap(int a,int b){

         System.out.println("Original Values before swap : ");
         System.out.println(" a : " + a);
         System.out.println(" b : " + b);

         int temp;

         temp=a;
         a=b;
         b=temp;

         System.out.println("Change Value After Swap : ");

         System.out.println("a :" + a);
         System.out.println("b : " + b);

     }

     public static void main(String[] args){

        Scanner input= new Scanner(System.in);
//        int a = 9;
//        int b=2;
//       // swap(a,b);
//
//     swapWithoutTemp(a,b);

         System.out.println("enter the Size : ");
//         int n= input.nextInt();
         int[] arr={1,2,3,4,5};
        int[] ans=Reverse_Array(arr);

        PrintArray(ans);


    }
}
