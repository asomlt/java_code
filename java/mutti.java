interface Student {
    void learn();
}

interface Employ {
    void work();
}

class Teacher implements Student, Employ {
    public void learn() {
        System.out.println("Teacher is learning.");
    }

    public void work() {
        System.out.println("Teacher is working.");
    }
}

public class mutti {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.learn();
        teacher.work();
    }
}
