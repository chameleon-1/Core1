package task.oop;

public class Child2 extends Parent {
    @Override
    public int m1(int a1, int a2) {
        return super.m1(a1, a2);
    }

    public int m1(int a1, int a2, int a3) {
        return a1 + a2 + a3;
    }

    @Override
    public int m2(String b1, int b2) {
        return super.m2(b1, b2);
    }

    public String m2(String b1, String b2, String b3) {
        int b11 = Integer.parseInt(b1);
        int b12 = Integer.parseInt(b2);
        int b13 = Integer.parseInt(b3);
        int b0 = b11 + b12 + b13;
        String b00 = Integer.toString(b0);
        return b00;
    }

    @Override
    public String m3(String c1) {
        return super.m3(c1);
    }

    public String m3(String c1, String c2) {
        return c1 + c2;
    }

    @Override
    public void m4() {
        super.m4();
    }

    public void m4(String d1) {
        System.out.println("I am child 2 " + d1);
    }

    @Override
    public String m5(String e1, String e2) {
        return super.m5(e1, e2);
    }

    public String m5(String e1, String e2, String e3) {
        return e1 + e2 + e3;
    }
}
