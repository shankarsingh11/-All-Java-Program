public class pattern{
    public static void main(String[] args) {  //pattern solid rectangle
        int n=10;
        int m=9;
        // outer loop
        for(int i=0;i<n;i++){
            // inner loop
           for(int j=0;j<m;j++){
              System.out.print(" * ");
           }
           System.out.println();
        }
    }
}