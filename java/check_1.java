interface Student{
    void learner();
}
interface Employ{
    void skillmaker();
}
class Teache implements Student,Employ{
    public void learner(){
        System.out.println("learner");
    }
     public void skillmaker(){
        System.out.println("employ");
    }
}
public class check_1 {
    public static void main(String[] args) {
        Teache t=new Teache();
        t.learner();
        t.skillmaker();
    }
}
