package bootcamp_2.input;

import java.util.Scanner;

public class JavaUserInputV2 {
    public static void main(String[] args) {


        try (Scanner stdin = new Scanner(System.in)) {
            System.out.print("What is your name: ");
            String inputName = stdin.nextLine();

            System.out.print("How old are you: ");
            int inputAge = stdin.nextInt();

            System.out.println("Your name is: " + inputName);
            System.out.println("Your age: " + inputAge);

        } catch (Exception e) {
            System.out.println("Please enter the number!");
        }


    }
}
