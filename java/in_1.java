class ram {
    int height = 100;
    int a;
    int b;
    String c;
    String money = "owner of money";

    void figth() {
        System.out.println(" ram is great fighter");
    }

    ram(int a, int b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    void info() {
        System.out.println("the info is in form   " + this.a);
        System.out.println("the info is in form   " + this.b);
        System.out.println("the info is in form   " + this.c);
    }

}

public class in_1 {

    public static void main(String[] args) {
        ram ji = new ram(5, 6, "Ram Ram ji");
        ji.info();
        System.out.println(ji.a);
        System.out.println(ji.b);
        System.out.println(ji.c);

        ji.figth();
    }
}