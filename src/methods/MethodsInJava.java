package methods;

public class MethodsInJava {
    public static void main(String[] args) {
        sum1();
        sum2(1, 2);
        printPow(6);

        int num = returnOneNum();
        System.out.println("Return 1: " + num);

        int firstNum = 40;
        int secondNum = 50;
        int sum = sum(firstNum, secondNum);
        System.out.println(firstNum + " + " + secondNum + " = " + sum);

        int resultOfSum = sum(10, 20);
        System.out.println("The result of sum: " + resultOfSum);

        double firstN = 34.4;
        double secondN = 55.6;
        double result = sum(firstN, secondN);
        System.out.println("Double sum is: " + result);

    }

    public static void sum1() {
        int firstNum = 1;
        int secondNum = 2;

        int result = firstNum + secondNum;
        System.out.println("Sum is: " + result);
    }

    public static void sum2(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println("Sum is: " + result);
    }

    public static void printPow(int number) {
        System.out.println("Pow is: " + (number * number));
    }

    public static int returnOneNum() {
        return 1;
    }

    public static int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static double sum(double firstNum, double secondNum){
        return firstNum + secondNum;
    }
}
