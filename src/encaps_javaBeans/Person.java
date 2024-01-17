package encaps_javaBeans;

/**
 * JavaBeans class-nın bütün elementləri - instance variables private olmalıdır
 * It has to have getter&setter methods
 * JavaBeans naming convention:
 * - setName, setSurname, setAge, setPersonName
 * - getName, getSurname, getAge, getPersonName
 * - is, get: -> isOld, getOld (boolean get method)
 * Encapsulation OOP
 */
public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean old;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        //this.age = Math.abs(age); daxil edilən ədədi müsbətə çevirir
//        if (age < 0) {
//            System.out.println("Age can't be a negative number!");
//        } else this.age = age;
        this.age = age;
    }

    public void setOld(boolean old) {
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        if (age < 0) {
            System.out.print("Age can't be a negative number! ");
        }
        return Math.abs(age);
    }

    public boolean isOld() {
        return age >= 50 || old;
//      return  old;
    }

}
