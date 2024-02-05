package methods.challenges;

public class AndOr {
    public static void main(String[] args) {
        System.out.println(true && true); //true
        System.out.println(true || true); //true
        System.out.println(true && false);//false
        System.out.println(false || true); //true

        System.out.println(true && true && true || false); //true
        System.out.println(true && true && true && false); //false
        System.out.println(false || false  || false || true); //true
    }
}
