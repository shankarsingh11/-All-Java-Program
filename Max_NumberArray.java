class Max_ElementArray{
    void Max(){
        int ans=0;
        int [] element={10,39,46,20,10,19,37,35,2,15,0};

        for (int i = 0; i < element.length ; i++) {
          if (element[i]>ans) {
              ans = element[i];
          }
        }
        System.out.println(ans);
    }

    void Search_Number(){

        int [][] element1={{12,28,49},{68,56,24},{25,10,65},{55,70,90},{75,96,10}};

        int x=90;
        
        for (int i = 0; i <element1.length ; i++) {

            for (int j = 0; j <element1[i].length ; j++) {

                if (element1[i][j]==x){

                    System.out.println("number present in the Array : " + x );
                }


            }

        }
    }

}


public class Max_NumberArray {
    public static void main(String[] args) {
        Max_ElementArray obj=new Max_ElementArray();
        obj.Max();
        obj.Search_Number();
    }
}
