package abstraction;

//Abstract class-in obyektini yarada bilmirik,
public abstract class Worker extends Person {

    double profit;

    public Worker(String name, int age, String birthDate, String personId) {
        super(name, age, birthDate, personId);
    }

    //abstract method-lar final, private ola bilməz - əks halda həmin methodlardan digərləri istifadə edə bilmir.
    public abstract double calculateIncome(double personProfit, double addBonus, int expYear);


}
