package task.oop;

public class Parent {
    public int m1(int a1, int a2) {
        return a1 + a2;
    }

    public int m2(String b1, int b2) {
        int b11 = Integer.parseInt(b1);
        return b11 + b2;
    }

    public String m3(String c1) {
        return c1;
    }

    public void m4() {
        System.out.println("I am parent");
    }

    public String m5(String e1, String e2) {
        return e1 + e2;
    }
}
