interface Shape {

    void square(int n);

    void cube(int n);
}

class Calculate implements Shape {

    public void square(int n) {
        System.out.println("Square = " + (n * n));
    }

    public void cube(int n) {
        System.out.println("Cube = " + (n * n * n));
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Calculate obj = new Calculate();

        obj.square(5);
        obj.cube(5);
    }
}