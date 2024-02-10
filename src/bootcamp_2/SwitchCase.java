package bootcamp_2;

import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        int num;

        try(Scanner stdin = new Scanner(System.in)){
            System.out.print("Please enter the number: ");
            num = stdin.nextInt();
        }

 /*       if(num == 1){
            System.out.println("One");
        } else if(num == 2){
            System.out.println("Two");
        } else if(num == 3){
            System.out.println("Three");
        } else {
            System.out.println("Please enter the num range of 1-3");
        }


        switch (num) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            default -> System.out.println("Please enter the num range of 1-3");
        }

  */

        switch (num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Please enter the num range of 1-3");
        }
    }
}
