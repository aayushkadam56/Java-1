import java.util.Scanner;

class Employee {

    double basic, hra, da, gross;

    Employee(double basic) {
        this.basic = basic;
    }

    void calculateSalary() {
        hra = basic * 0.20;
        da = basic * 0.10;
        gross = basic + hra + da;
    }

    void display() {
        System.out.println("Basic Salary = " + basic);
        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Gross Salary = " + gross);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Employee emp = new Employee(basic);

        emp.calculateSalary();
        emp.display();
    }
}