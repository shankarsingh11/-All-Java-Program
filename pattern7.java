public class pattern7 {
    public static void main(String[] args) {
        // solid rhombus pattern
        int n=5;
        int m=8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i+j<=5){
                    System.out.print("  ");
                }else{
                    if(i+j<=9){
                        System.out.print(" *");
                    }
                }
            }
            System.out.println();
        }
    }
}
