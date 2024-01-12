package access_modifier;
/**
 * private   --> only same class
 * public    --> same project
 * default   --> same package (inheritance allowed) (When we make default the class, we cannot create class objects in other packages
 * protected -->
 */

import access_modifier.pond.duck.FatherDuck;
import access_modifier.pond.duck.MotherDuck;

public class Test {
    public static void main(String[] args) {
        FatherDuck fatherDuck = new FatherDuck();
        MotherDuck motherDuck = new MotherDuck();

    }
}
