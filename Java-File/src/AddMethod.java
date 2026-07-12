import java.util.Scanner;

public class AddMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Calling the method works perfectly here
        System.out.println("Sum = " + add(a, b));
        
        sc.close(); // Good practice to close the scanner when done!
    }

    // This is the actual method definition
    static int add(int x, int y) {
        return x + y;
    }
}