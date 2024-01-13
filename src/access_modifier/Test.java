package access_modifier;
/**
 * private   --> only same class (not allowed: same package - subclass and non-subclass, diff. pack - sub and non-subclass)
 * public    --> same project: same class, same and diff. pack, sub and non-subclass
 * default   --> same package (inheritance allowed - same pack sub and non-subclass), (not allowed: diff pack: sub and non-subclass,
 * when we make default the class, we cannot create class objects in other packages
 * protected --> same class and same package: sub and non-subclass, diff pack subclass. (not allowed: diff pack non-subclass)
 */

import access_modifier.pond.duck.FatherDuck;
import access_modifier.pond.duck.MotherDuck;

public class Test extends MotherDuck {
    public static void main(String[] args) {
        FatherDuck fatherDuck = new FatherDuck();
        MotherDuck motherDuck = new MotherDuck();

        //motherDuck.quack(); we can't call the default methods/fields in diff pack.
        Test test = new Test();
        //    test.quack(); we can't call the default field/methods in diff pack, subclass


        //JustDuckling just = new JustDuckling();
        //you can't make the object - JustDuckling constructor's is default.


    }
}
