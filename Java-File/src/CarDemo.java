class Car {

    int speed;
    int fuelLevel;

    Car(int speed, int fuelLevel) {
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }

    void display() {
        System.out.println("Speed = " + speed + " km/h");
        System.out.println("Fuel Level = " + fuelLevel + "%");
    }
}

public class CarDemo {

    public static void main(String[] args) {

        Car car = new Car(80, 60);

        car.display();
    }
}