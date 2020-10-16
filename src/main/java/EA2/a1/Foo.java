package EA2.a1;

public class Foo {
    private int x;
    private static char c = 'c';

    Foo(int x) {
        this.x = x;
    }

    Foo() {
        x = 42;

    }

    class Bar {
        Object y;

        void m(Foo foo) {
            y = new Object();
        }

        void m(String foo) {
            y = foo;
        }

        Bar() {
            y = new Object();
        }
    }

    Object z() {
        return new String();
    }
}