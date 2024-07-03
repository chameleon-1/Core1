package task.oop;

public class Child1 extends Parent {
    @Override
    public int m1(int a1, int a2) {
        return a1 * a2;
    }

    @Override
    public int m2(String b1, int b2) {
        int b11 = Integer.parseInt(b1);
        return (b11 + b2) * 2;
    }

    @Override
    public String m3(String c1) {
        c1.charAt(0);
        return c1;
    }

    @Override
    public void m4() {
        System.out.println("I am child1");
    }

    @Override
    public String m5(String e1, String e2) {
        String e3 = e1 + e2;
        int length = e3.length();
        int midIndex = length / 2;
        String halfStr = e3.substring(0, midIndex);
        return halfStr;
    }
}
