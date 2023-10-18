public class MAX_MIN_ELEMENT {
    static int mm(int a[],int i,int j,int max,int min){
        if (i ==j){
         return min ;
        } else if (i==j-1){


        }
    }
    public static void main(String[] args) {
        int[]a= {10,29,40,20,50,90,30,70,60,80};
        int max = a[0];
        int min = a[0];
        int i = 0;
        int j = 9;
        System.out.println(mm(a,i,j,max,min));
    }
}
