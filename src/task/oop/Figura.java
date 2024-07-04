package task.oop;

public abstract class Figura {
    int x;
    int y;

    Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract int getPerimetr();

    public abstract int getArea();


}

