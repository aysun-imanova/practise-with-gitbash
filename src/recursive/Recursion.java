package recursive;

import java.util.Scanner;

public class Recursion {
    public void printClass() {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a value: ");
        String input = stdin.nextLine();

        System.out.println("The entered value is " + input);

        if (input.equalsIgnoreCase("Java Developer")) {
            System.out.println("You've entered Java Developer. Do you want to continue? ");
            input = stdin.nextLine();
            if (input.equalsIgnoreCase("Yes")) {
                printClass();
            }
        } else {
            System.out.println("Program is terminated!");
        }
    }

}
