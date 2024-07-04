package task.oop;

public class Circul extends Figura {
    private int radius;
    final double pi = 3.1415;

    Circul(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public int getPerimetr() {
        double p = 2 * pi * radius;
        int value = (int) p;
        return value;
    }

    @Override
    public int getArea() {
        double p1 = pi * radius * radius;
        int value1 = (int) p1;
        return value1;
    }
}