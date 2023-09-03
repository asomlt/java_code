public class q13 {
    public static void main(String[] args) {
        int n=5;
        
        for (int i = 1; i <=n; i++) {
                for (int j =1;j<=n-i; j++) {
                   System.out.print(" ");
                }
                int space=n-i;
                for (int j=i; j>=1; j--) {
                //    int value=j;
                
                   System.out.print(j);
                }
                 for (int j =2;j<=i; j++) {
                   System.out.print(j);
                }
               
                System.out.println();
        }
    }
    
}
