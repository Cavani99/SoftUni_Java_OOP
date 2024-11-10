package solid;

import java.util.List;

public class Printer extends Print{

    public void printSum(List<Object> products) {
        System.out.printf("Sum: %f\n", sum(products));
    }

    public void printAverage(List<Object> products) {
        System.out.printf("Average: %f\n", average(products));
    }
}
