package methods;

public class Sample {
    int a;
    int b;
    static int d;

    public static void main(String[] args0) {
        Sample sample = new Sample();
        sample.d = 10;
        sample = null;
        System.out.println(sample.d);

    }
}
