import find_arrays_avg.CreateArrays;
import loops.ForLoops;
import methods.Months;
import recursive.Recursion;

public class Main {
    public static void main(String[] args) {
        CreateArrays create = new CreateArrays();
        Recursion recursion = new Recursion();
        ForLoops forLoops = new ForLoops();

/**
 *  You can uncomment any method to call it.
 * */


//        create.findAvg();
//
//        recursion.printClass();
//
//        forLoops.nestedLoop();
//        forLoops.printStarPyramid();
//        forLoops.printStarOpposite();
//        forLoops.printStarReverse();
//        forLoops.printEqualsMark();


        for (Months months : Months.values()) {
            System.out.println(months + " " + months.getValue());
        }

    }
}

