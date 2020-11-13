
class A {
    void m (A a) {
        System.out.println("1");
    }
}

class B extends A {
    void m (A a) {
        System.out.println("2");
    }
    void m (B b) {
        System.out.println("3");
    }
}

public abstract class Main {
    public static void main(String[] args) {
        B b = new B();
        A a = b;

        a.m(a);
        a.m(b);
        b.m(a);
        b.m(b);
    }
}
