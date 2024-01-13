package access_modifier.pond.duck;

public class SomeDuckling extends MotherDuck {
    public void makeNoise() {
        SomeDuckling someDuckling = new SomeDuckling();

        String motherDuckling = someDuckling.noise;
        //We can call the default methods/fields in same pack, subclass.

    }
}
