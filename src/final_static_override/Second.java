package final_static_override;

/**
 * we can declare private variables again in other inherit class
 * static fields/methods don't pass to inherit class
 * private -> default -> protected -> public
 * we can't override static methods
 * final fields/methods can't pass (can't override) to inherit class
 * when we create final variable - we have to assign a  value for constant
 */
public class Second extends First {

    private int count;
    public int number;

    private void print() {
        System.out.println(count);
    }

    static void eat(int count) {
        System.out.println("Static method in Second class");
    }

    @Override
    public void test() {
        System.out.println("Test method in Second class");
    }


    public static void main(String[] args) {
//        First first = new First();
//        first.test();
//        Second second = new Second();
//        second.test();
//        second.hasFeatures();
//
//        first = second; //First st = new Second(); -> method çağırılanda bərabərliyin sağ tərəfi nəzərə alınır.
//
//        first.test();

        Second second = new Second();
        System.out.println(second.hasFeatures()); //we can call the final method but can't override
        int age = second.age; // we can't change the value of final variable
        System.out.println(age);
    }


}