package find_arrays_avg;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a java program that average of arrays numbers(FE: numbers are, [1,2,3,4,5] --> average is : 3
 */
public class CreateArrays {
    Scanner sc = new Scanner(System.in);


    public void findAvg() {

        System.out.println("Array-in elementləri sayını daxil edin: ");
        int arrayCount = sc.nextInt();

        double[] myArray = new double[arrayCount];
        double avg = 0;
        for (int i = 0; i < arrayCount; i++) {
            System.out.println("Array-in elementlərini daxil edin: ");
            myArray[i] = sc.nextInt();
            avg += (myArray[i]) / arrayCount;

        }
        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Array-in elemenlərinin ədədi ortası = " + avg);


    }
}
