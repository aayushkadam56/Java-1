import java.util.Scanner;

class ATM {

    int pin = 1234;
    double balance = 5000;

    void check(int enteredPin) {

        if (enteredPin == pin) {
            System.out.println("PIN Verified");
            System.out.println("Current Balance = ₹" + balance);
        } else {
            System.out.println("Invalid PIN");
        }
    }
}

public class ATMDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM obj = new ATM();

        System.out.print("Enter PIN: ");
        int p = sc.nextInt();

        obj.check(p);
    }
}