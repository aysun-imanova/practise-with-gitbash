package access_modifier.pond.duck;

public class GoodDuckling {
    public void makeNoise() {
        MotherDuck motherDuck = new MotherDuck();
        motherDuck.quack();
        System.out.println(motherDuck.noise);

    }
}
