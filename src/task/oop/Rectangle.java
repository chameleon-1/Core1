package task.oop;

class Rectangle extends Figura {
    private int width;
    private int height;

    Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getPerimetr() {
        return width * 2 + height * 2;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}