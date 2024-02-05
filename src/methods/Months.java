package methods;

import java.util.Scanner;

public enum Months implements SomeMethods {
    JANUARY(31) {
        @Override
        public void printDaysInfo() {

        }
    }, FEBRUARY(29) {
        @Override
        public void printDaysInfo() {

        }
    }, MARCH(31) {
        @Override
        public void printDaysInfo() {

        }
    }, APRIL(30) {
        @Override
        public void printDaysInfo() {

        }
    }, MAY(31) {
        @Override
        public void printDaysInfo() {

        }
    },
    JUNE(30) {
        @Override
        public void printDaysInfo() {

        }
    },
    JULY(31) {
        @Override
        public void printDaysInfo() {

        }
    }, AUGUST(31) {
        @Override
        public void printDaysInfo() {

        }
    }, SEPTEMBER(30) {
        @Override
        public void printDaysInfo() {

        }
    }, OCTOBER(31) {
        @Override
        public void printDaysInfo() {

        }
    }, NOVEMBER(30) {
        @Override
        public void printDaysInfo() {

        }
    }, DECEMBER(31) {
        @Override
        public void printDaysInfo() {

        }
    };

    private int value;

    Months(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the days of the month: ");
        int dayOfMonth = scan.nextInt();

        for (Months months : Months.values()) {
            if (dayOfMonth <= 31 && months.getValue() == 31) {
                System.out.println(months);
            } else if (dayOfMonth <= 30 && months.getValue() == 30) {
                System.out.println(months);
            } else if (dayOfMonth <= 29 && months.getValue() == 29) {
                System.out.println(months);
            } else {
                System.out.println("Wrong entered data!");
            }
//            System.out.println(months + " " + months.getValue());
        }
    }


}
