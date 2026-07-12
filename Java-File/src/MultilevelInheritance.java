class Person {

    String name = "Ayush";
}

class Student extends Person {

    int rollNo = 101;
}

class Result extends Student {

    int marks = 90;

    void display() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks   : " + marks);
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        Result obj = new Result();

        obj.display();
    }
}