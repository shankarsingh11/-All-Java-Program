class DemoOfArray {

    void MultiArray() {
        int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Array Number" + arr[i][j]);
            }
        }

    }

    void SumOfArray() {
        int[] arr_1 = { 5, 9, 1 };
        int sum = 0;
        for (int i = 0; i < arr_1.length; i++) {
            sum = sum + arr_1[i];
        }
        System.out.println("sum is :" + sum);
    }

    void Traverse() {
        int[] arr_2 = { 5, 12, 40, 20, 1, 70, 15, 2, 6 };
        System.out.println("Length is:" + arr_2.length);
    }

    void MaxNumber() {
        int[] arr_3 = { 6, 12, 4, 1, 9, 30, 0, 7, 5 };
        int ans = 0;
        for (int i = 0; i < arr_3.length; i++) {
            if (arr_3[i] > ans) {
                ans = arr_3[i];
            }
        }
        System.out.println("Largest number is :" + ans);
    }

    void SearchElement(){
        int []arr_4={1,5,9,8,30,20,1,14,11,5,3,9};
        int x=9;
        int ans=-1;
        for(int i=0;i<arr_4.length;i++){
            if(arr_4[i]==x){
                ans=i;
                break;
            }
        }
        System.out.println("index Of x is :"+ans);
    }

}

public class shankar {
    public static void main(String[] args) {
        DemoOfArray obj1 = new DemoOfArray();
        // obj1.MultiArray();
        // obj1.SumOfArray();
        // obj1.Traverse();
        // obj1.MaxNumber();
        obj1.SearchElement();

    }
}
