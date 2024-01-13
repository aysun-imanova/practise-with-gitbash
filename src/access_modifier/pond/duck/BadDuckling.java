package access_modifier.pond.duck;

/**
 * FatherDuck class is public, that's why we can make the object
 * We can't call the FatherDuck's fields and methods - they're private ()
 * Private variables are not passed to sub or superclasses during inheritance.
 */

public class BadDuckling extends FatherDuck {
    public String noise = "quack-quack-quack";

    public void makeNoise() {
        FatherDuck fatherDuck = new FatherDuck();

        BadDuckling badDuckling = new BadDuckling();

        //badDuckling.quack(); - we can't call

        JustDuckling just = new JustDuckling();
        just.quack();
        //we can call the protected fields/method in the same pack

    }
}
