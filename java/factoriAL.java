import java.util.Scanner;

public class factoriAL {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number ");
        int a= sc.nextInt();
        int s=1;
        for (int i = 1; i <= a; i++) {
            // System.out.println();
            s=s*i;
            
        }
        System.out.println(s);
    }}