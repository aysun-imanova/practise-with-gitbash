package final_static_override;

public class First {
    public final int age = 10;
    private int number;
    public int count1;

    private void print() {
        System.out.println(number);
    }

    static void eat(int number) {
        System.out.println("Animal is eating!");
    }


    public void test() {
        System.out.println("First Class");
    }

    public final boolean hasFeatures() {
        return true;
    }
}

