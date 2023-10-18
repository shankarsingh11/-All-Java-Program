public class Max {
    public static void main(String[] args) {
        int[] arr={1,2,6,10,7,0,23,12,34,51,15,35,100,9};

       System.out.println(max(arr));// output : 100

        System.out.println(maxRange(arr,0,7)); // output:23
    }

 // for maxval

    // work on edges cases here,array like a being null


    static int max(int[] arr){

        if (arr.length==0){
            return -1;
        }

        int maxVal=arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>maxVal){
                maxVal=arr[i];
            }

        }
        return maxVal;
    }


    // for range
    static int maxRange(int[] arr,int start,int end){

        if (end>start){
            return -1;
        }

        if(arr == null){
            return -1;
        }

        int maxVal=arr[start];
        for (int i = start; i <=end ; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }

        }
        return maxVal;
    }

}
