package task.oop;

public class Triangle extends Figura{         //треугольник равнобедренный
private int height;
private int width;

Triangle(int x, int y, int height, int width){
    super(x,y);
    this.height=height;
    this.width=width;
}

    @Override
    public int getPerimetr() {
        return 3*width;
    }

    @Override
    public int getArea() {
    double a = 0.5*width*height;
    int value = (int)a;
    return value;
    }
}