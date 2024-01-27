package abstraction;

import interfaces.CanWorkable;

// Abstract class və interface-in obyektini yarada bilmirik,
// Worker class-i yaradılır və ona child class-in obyekti mənimsədilir.
public class TestMain {
    public static void main(String[] args) {

        Teacher worker = new Teacher("Aysun", 27, "31.07.1996", "5XX3AAA");
        System.out.println("Müəllimin maaşı: " + worker.calculateIncome(1500, 150.45, 5));
        worker.work();
        System.out.println("CanWorkable has age variable: " + CanWorkable.AGE);
        System.out.println(worker.test());
//        System.out.println(worker.testInt()); -> can't call
        System.out.println(CanWorkable.testInt());//can call


    }
}
