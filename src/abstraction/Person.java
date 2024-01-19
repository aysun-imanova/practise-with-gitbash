package abstraction;

public class Person {
    String name;
    int age;
    String birthDate;
    String personId;

    public Person(String name, int age, String birthDate, String personId) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.personId = personId;
    }


    public void eat() {
        System.out.println("Person is eating...");
    }

    public void sleep() {
        System.out.println("Person is sleeping...");
    }


}
