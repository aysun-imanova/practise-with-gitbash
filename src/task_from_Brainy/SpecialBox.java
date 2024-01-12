package task_from_Brainy;

public class SpecialBox extends Box {
    double weight;

    SpecialBox(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    double volume2() {
        return 10;
    }

    //virtual method, dynamic method dispatch
    @Override
    public double volume() {
        return 20;
    }

    public static void main(String[] args) {
        SpecialBox specialBox = new SpecialBox(1, 2, 3, 4);
        System.out.println(specialBox.volume());
        Box box = new SpecialBox(1, 2, 3, 5);

        System.out.println(box.volume());

    }

}
