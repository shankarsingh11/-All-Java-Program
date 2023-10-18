import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
       int[] nums={12,34,54,64,74};
                                                         // string show a immutability behaviour in java
        System.out.println(Arrays.toString(nums));

        change(nums);// Array show mutability behaviour in java
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[1]=100;
    }
}
