package final_static_override;

/**
 * we can declare private variables again in other inherit class
 * static fields/methods don't pass to inherit class
 * private -> default -> protected -> public
 * we can't override static methods
 */
public class Second extends First {

    private int count;

    private void print() {
        System.out.println(count);
    }

    static void eat(int count) {
        System.out.println("Static method in Second class");
    }

    @Override
    public void test() {
        System.out.println("Test method in Second class");
    }

    public static void main(String[] args) {
        First first = new First();
        first.test();

        Second second = new Second();
        second.test();

        first = second;

        first.test();
    }


}