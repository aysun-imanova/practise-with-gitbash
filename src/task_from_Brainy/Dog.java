package task_from_Brainy;

/**
 * animal is parent class, you can extend only from one class
 * all classes extend Object class
 */
public class Dog extends Animal {
    public Dog(int age) {
        super(age); // you have to write first line
        System.out.println("Dog constructor");
    }

    public static void main(String[] args) {
        Dog dog = new Dog(56);
        System.out.println(dog.getAge());
    }
}
