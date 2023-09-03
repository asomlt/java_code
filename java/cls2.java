class student{
    String sec;
    int age;
    long mobile;
    String addres;
    static  String school= "sivalik";
    public void display(){
        System.out.println("name : "+student.school);
        System.out.println("name : "+this.sec);
        System.out.println("age : "+this.age);
        System.out.println("mobile : "+this.mobile);
        System.out.println("addres : "+this.addres);
        System.out.println();
        
    }

    student(String sec,int age,long mobile,String addres){
        this.sec = sec;
        this.age = age;
        this.mobile = mobile;
        this.addres = addres;


    }
}


public class cls2{
    public static void main(String[] args) {
        student obj = new student("A" ,19, 821,"agra" );
        obj.display();
        System.out.println(student.school);
        
        
    }}
