public class q11 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            // for (int j = 1; j <= 9; j++) {
                for(int k=1;k<=(n-i);k++){
                    System.out.print(" ");
                }
                for (int k = 0; k <=n; k++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
