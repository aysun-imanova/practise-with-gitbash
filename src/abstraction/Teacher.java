package abstraction;

import interfaces.CanDone;
import interfaces.CanWorkable;

//Çoxlu sayda interface implement edə bildiyimiz halda bir class yalnız 1 class-dan extends edə bilir
public class Teacher extends Worker implements CanWorkable, CanDone {
    public Teacher(String name, int age, String birthDate, String personId) {
        super(name, age, birthDate, personId);
    }

    @Override
    public double calculateIncome(double personProfit, double addBonus, int expYear) {
        profit = personProfit * expYear + addBonus;
        return profit;
    }

    @Override
    public void work() {
        System.out.println("Teacher is working...");
    }

    @Override
    public void workAddition() {
        System.out.println("Teacher is working additionally...");
    }


    @Override
    public void done() {
        System.out.println("Teacher is doing something...");
    }

    @Override
    public int test() {
        return 50;
    }
}
