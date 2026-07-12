class Fan {

    int speed;
    boolean isOn;

    Fan(int speed, boolean isOn) {
        this.speed = speed;
        this.isOn = isOn;
    }

    void displayStatus() {
        System.out.println("Speed : " + speed);
        System.out.println("Fan is " + (isOn ? "ON" : "OFF"));
        System.out.println();
    }
}

public class FanDemo {

    public static void main(String[] args) {

        Fan fan1 = new Fan(3, true);
        Fan fan2 = new Fan(0, false);

        System.out.println("Fan 1:");
        fan1.displayStatus();

        System.out.println("Fan 2:");
        fan2.displayStatus();
    }
}