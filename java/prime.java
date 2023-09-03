import java.util.Scanner;
public class prime {
    /**
     * @param agrs
     */
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        if ( a%2  !=0 || a%3 != 0) {
            System.out.println("prime");
            
        } else {
            System.out.println(" not prime");
        }
    }

    }