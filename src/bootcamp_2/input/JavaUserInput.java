package bootcamp_2.input;

import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        try {
            System.out.print("What is your name: ");
            String inputName = stdin.nextLine();

            System.out.print("How old are you: ");
            int inputAge = stdin.nextInt();

            System.out.println("Your name is: " + inputName);
            System.out.println("Your age: " + inputAge);

        } catch (Exception e) {
            System.out.println("Please enter the number!");
        }
        stdin.close();

    }
}
