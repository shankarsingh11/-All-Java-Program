class Max_Min_Num{
    void min_max(){
        int [][] arr={{12,34,20},{10,40,15},{27,55,24}};
        int max=0;
        int min =arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){

                if (arr[i][j]>max){
                    max=arr[i][j];

                }

                if (min>arr[i][j]){
                    min=arr[i][j];

                }
            }

        }
        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is : " + min);
    }
}
public class Mxx_Min_Array_Elements {

    public static void main(String[] args) {
        Max_Min_Num obj=new Max_Min_Num();
        obj.min_max();

    }
}
