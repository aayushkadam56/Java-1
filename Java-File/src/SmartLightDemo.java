class SmartLight {

    int brightness;

    SmartLight(int brightness) {
        this.brightness = brightness;
    }

    void increase() {
        if (brightness < 100)
            brightness += 10;
    }

    void decrease() {
        if (brightness > 0)
            brightness -= 10;
    }

    void display() {
        System.out.println("Brightness = " + brightness + "%");
    }
}

public class SmartLightDemo {

    public static void main(String[] args) {

        SmartLight light = new SmartLight(50);

        System.out.println("Initial Brightness:");
        light.display();

        light.increase();
        System.out.println("After Increasing:");
        light.display();

        light.decrease();
        System.out.println("After Decreasing:");
        light.display();
    }
}