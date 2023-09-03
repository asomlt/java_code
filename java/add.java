import java.util.Scanner;
public class add {
    /**
     * @param agrs
     */
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        System.out.println("enter number of times you wnat");
        int b = sc.nextInt();
        System.out.println(a);
        for(int i =1 ; i<=b;i++){
            // System.out.print(a*i);
            System.out.println(a+"X"+i+"="+a*i);
        }
    }

    }