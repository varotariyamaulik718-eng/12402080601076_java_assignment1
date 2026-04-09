class Outer {

    private String message = "Hello from Outer";

    class MemberInner {
        void display() {
            System.out.println("Member Inner: " + message);
        }
    }

    void showLocalClass() {
        class LocalInner {
            void display() {
                System.out.println("Local Inner: " + message);
            }
        }

        LocalInner li = new LocalInner();
        li.display();
    }

    void showAnonymousClass() {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Anonymous Inner: " + message);
            }
        };
        r.run();
    }
}

public class Practical7 {
    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.MemberInner mi = outer.new MemberInner();
        mi.display();

        outer.showLocalClass();

        outer.showAnonymousClass();
    }
}
