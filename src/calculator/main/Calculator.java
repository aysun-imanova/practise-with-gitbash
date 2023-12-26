package calculator.main;

import calculator.util.MathUtil;

import java.util.Scanner;

public class Calculator {

    Scanner stdin = new Scanner(System.in);
    MathUtil mathUtil = new MathUtil();

    public void calculate() {
        System.out.println("Enter the first number: ");
        double firstNumber = stdin.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNumber = stdin.nextDouble();

        System.out.println("Select the operation: \n1 - Addition \n2 - Subtraction \n3 - Multiplication \n4 - Division ");
        int operation = stdin.nextInt();

        double result = 0;
        if (operation == 1) {
            result = mathUtil.add(firstNumber, secondNumber);
        } else if (operation == 2) {
            result = mathUtil.sub(firstNumber, secondNumber);
        } else if (operation == 3) {
            result = mathUtil.multi(firstNumber, secondNumber);
        } else if (operation == 4) {
            result = mathUtil.div(firstNumber, secondNumber);
        } else {
            System.out.println("Invalid selection!");
        }
        System.out.println("The result is: " + result);

        System.out.println("Do you want to continue? yes/no");
        String answer = stdin.next();

        if (answer.equalsIgnoreCase("yes")) {
            calculate();
        } else {
            System.out.println("The program is terminated!");
        }

    }
}
