package interfaces;

//abstract methodları qeyd edirik
//private, protected, final - istifadə edilimir.
public interface CanWorkable {
    int AGE = 27;//dəyişənlər avtomatik olaraq public static final-dir.

    void work(); //method qarşısında public və abstract sözlərini yazmağa ehtiyac yoxdur, çünki default olaraq qeyd edilib.

    void workAddition();

    //we can declare default keyword in only interface not abstract. Bu bizə imkan verir ki, body-li method yazaq və eyni zamanda override edək.
    default int test() {
        return 10;
    }//we can't use final and abstract keyword in default method

    static int testInt() {
        return 45;
    } //we can't use static method via implemented class but can use CanWorkable.testInt();
}
