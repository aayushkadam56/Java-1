class Student {
    int rollNo;
    String name;

    void getStudentDetails(int r, String n) {
        rollNo = r;
        name = n;
    }
}

class Marks extends Student {
    int marks;

    void getMarks(int m) {
        marks = m;
    }

    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
    }
}

public class StudentInheritance {
    public static void main(String[] args) {

        Marks s = new Marks();

        s.getStudentDetails(101, "Ayush");
        s.getMarks(90);

        s.display();
    }
}