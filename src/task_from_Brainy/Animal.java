package task_from_Brainy;

public class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("Animal constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
