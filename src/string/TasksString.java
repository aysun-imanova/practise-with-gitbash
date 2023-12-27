package string;

import java.util.Scanner;

public class TasksString {
    Scanner stdin = new Scanner(System.in);

    public void check() {
        System.out.println("Enter some String: ");
        String userStr = stdin.nextLine();

        if (isPalindrome(userStr)) {
            System.out.println(userStr + " is palindrome!");
        } else {
            System.out.println(userStr + " is not palindrome!");
        }
        check();
    }

    public boolean isPalindrome(String check) {
        check = check.replaceAll(" ", "");

        check = check.toUpperCase();

        StringBuilder reversedStr = new StringBuilder(check).reverse();

        return check.equals(reversedStr.toString());
    }
}
