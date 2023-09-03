public class cls1 {

    class Innercls1 {
        int a;
        String b;
        int c;

        public void work() {
            System.out.println("hello");
            System.out.println("ram ram ji ");

        }
    

    public void info(int a, String b, int c){
        System.out.println(a+b+c);

    }
public void ar(){
    System.out.println(this.a);
      System.out.println(this.b);
        System.out.println(this.b);
    

}
}

    public static void main(String[] args) {
        Innercls1 obj = new Innercls1();
        obj.a=5;
        obj.b="ram ram ji";
        obj.c=22;
        obj.ar();
        // obj.info(5,"ram ram jai jai ram",100);


    }
}