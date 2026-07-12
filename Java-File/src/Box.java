class Box {
    double length, width, height;

    Box() {
        length = width = height = 1;
    }

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5, 4, 3);

        System.out.println("Volume of Box1 = " + b1.volume());
        System.out.println("Volume of Box2 = " + b2.volume());
    }
}