package access_modifier.pond.duck;

public class JustDuckling {

    //constructor is public by default
    JustDuckling() {
        // you can't make the object in others package - JustDuckling constructor's is default
    }

    protected String noise = "quack-quack";

    protected void quack() {
        System.out.println(noise);
    }

    protected void makeNoise() {
        quack();
    }
}
