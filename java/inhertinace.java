class animal{
    String aimaalname;
    public void walk(){
        System.out.println( "walk on 4 legs ");

    }
    public  void eat(){
        System.out.println("all anomal eating ");
    }
}

class horse extends animal{
    public void speed(){

    System.out.println("speed is 130kmp");
    }
}
public class inhertinace{
    public static void main(String[] args) {
        horse obj = new horse();
        obj.eat();
        obj.speed();
        obj.walk();
    }
}