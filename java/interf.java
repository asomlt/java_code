interface abs{
    void happy();

}
interface cds{
   void lover();
}
class test implements abs,cds {
     public void happy(){
        System.out.println("hello");
    }
    public void lover(){
        System.out.println("love you");
    }
 }

 public class interf{
    public static void main(String[] args) {
        test obj = new test();
        obj.happy();
        
    }
 }