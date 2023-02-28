public class pattern11 {
    public static void main(String[] args) {
        //SOLID RHOMBUS PATTERN
        
        int n =20;
        // OUTER LOOP
        for(int i=1;i<=n;i++){
            // INNER LOOP FOR SPACE
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            // INNER LOOP FOR STAR
            for(int j=1;j<=n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
