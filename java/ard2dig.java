import java.util.*;

public class ard2dig {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements in row of array");
        int num = obj.nextInt();
        System.out.println("Enter the number of elements in col of array");
        int rum = obj.nextInt();
        String Student_name[][] = new String[num][rum];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < rum; j++) {
                System.out.println("Enter the of elements in array in string");
                String sc = obj.nextLine();
                Student_name[i][j] = sc;
            }

        }
        System.out.println(Student_name);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < rum; j++) {
                System.out.print(" " + Student_name[i][j] + " ");
            }System.out.println();

        }

    }

}