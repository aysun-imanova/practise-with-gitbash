package abstraction;

public class Teacher extends Worker {
    public Teacher(String name, int age, String birthDate, String personId) {
        super(name, age, birthDate, personId);
    }

    @Override
    public double calculateIncome(double personProfit, double addBonus, int expYear) {
        profit = personProfit * expYear + addBonus;
        return profit;
    }


}
