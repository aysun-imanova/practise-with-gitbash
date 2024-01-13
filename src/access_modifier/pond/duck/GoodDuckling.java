package access_modifier.pond.duck;

public class GoodDuckling {
    public void makeNoise() {
        MotherDuck motherDuck = new MotherDuck();
        motherDuck.quack();
        System.out.println(motherDuck.noise);

        //System.out.println(motherDuck.makeNoise); we can't call the private method
    }
}
