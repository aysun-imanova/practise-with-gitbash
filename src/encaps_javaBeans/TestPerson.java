package encaps_javaBeans;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Aysun");
        person.setSurname("Imanova");
        person.setAge(-27);

        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        System.out.println(person.isOld());

    }
}
