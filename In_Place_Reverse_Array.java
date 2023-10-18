public class In_Place_Reverse_Array {

   static void swapArray(int[] arr,int i,int j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
   }
    static void inPlace_reverseArray(int[] arr){
       int   j= arr.length-1;
        int  i=0;

        while (i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        }
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

       int[] arr={1,2,3,4,5};
       inPlace_reverseArray(arr);
       printArray(arr);

    }
}
