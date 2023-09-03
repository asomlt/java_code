class working{
    public void emply(String a){
        System.out.println("this is employ "+a);
    }
    public void emply(int a){
        System.out.println("this is salary "+a);
    }
    public void emply(double a){
        System.out.println("this is mobile "+a);
    }
}
public class poly2{
    public static void main(String[] args) {
        working obj = new working();
        obj.emply(844);
        obj.emply("arpit ");
        obj.emply(19);
    }
}