import java.util.*;
public class ar2d {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int num= obj.nextInt();
        String Student_name[]= new String[num];
        for(int i =0;i<num;i++){
            System.out.println("Enter the of elements in array in string");
            String sc= obj.nextLine();
            Student_name[i]=sc;
        }System.out.println(Student_name);
        for(int i =0;i<num;i++){
            System.out.print(" "+Student_name[i]+" ");
             

        }
        

    }
    
}