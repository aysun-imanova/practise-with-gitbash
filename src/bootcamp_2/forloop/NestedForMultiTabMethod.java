package bootcamp_2.forloop;

import java.util.Scanner;

public class NestedForMultiTabMethod {
    public static void main(String[] args) {
        int start;
        int end;

        try (Scanner stdin = new Scanner(System.in)) {
            System.out.print("Enter the start: ");
            start = stdin.nextInt();

            System.out.print("Enter the end: ");
            end = stdin.nextInt();
        }
        

        multiTable(start, end);

    }

    static void multiTable(int start, int end){
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
