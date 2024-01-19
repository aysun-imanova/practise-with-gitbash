package abstraction;

// Abstract class-in obyektini yarada bilmirik,
// Worker class-i yaradılır və ona child class-in obyekti mənimsədilir.
public class TestMain {
    public static void main(String[] args) {

        Teacher worker = new Teacher("Aysun", 27, "31.07.1996", "5XX3AAA");
        System.out.println("Müəllimin maaşı: " + worker.calculateIncome(1500, 150.45, 5));
    }
}
