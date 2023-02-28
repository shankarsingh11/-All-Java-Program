public class pattern10 {
    public static void main(String[] args) {
        // BUTTERFLY PATTERN

        int n=5;
        // outer loop      // part first
        for(int i=1;i<=n;i++){
            //first iner loop
            for(int j=1;j<=i;j++){
            System.out.print(" *");
            }
               // loop for space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
              // second inner loop
            for(int j=1;j<=i;j++){
                System.out.print(" *");

            }
            System.out.println(); 
        }

        //outer loop  
                          // part second
        for(int i=n;i>=1;i--){
            // first inner loop

            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            // for space inner loop

            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //second inner loop

            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
