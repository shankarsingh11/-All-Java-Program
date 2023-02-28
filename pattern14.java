public class pattern14 {
    public static void main(String[] args) {
       // DIAMOND PATTERN
       int n=10;
       // 1ST PART
       for(int i=1;i<=n;i++) {
        for(int j=1;j<=n-i;j++){
            //SPACE
            System.out.print("   ");
        }
        // STAR
        for(int j=1;j<=(2*i-1);j++){
            System.out.print("*"+"  ");
        }
        System.out.println();

       }
       // 2ND PART

       for(int i=n;i>=1;i--){
        // SPACE
         for(int j=1;j<=n-i;j++){
            System.out.print("   ");
         }
         // STAR
         for(int j=1;j<=(2*i-1);j++){
            System.out.print("*"+"  ");
           }
           System.out.println();

         }

       }

    }


