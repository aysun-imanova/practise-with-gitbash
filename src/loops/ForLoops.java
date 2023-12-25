package loops;

public class ForLoops {

    public void nestedLoop() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }
    }


    public void printStarPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printStarOpposite() {
        int term = 6;
        for (int i = 1; i <= term; i++) {
            for (int j = term; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printStarReverse() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public void printEqualsMark() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j != 3) {
                    System.out.print("= ");
                } else {
                    System.out.print("=  ");
                }
            }
            System.out.println();
        }
    }

}


