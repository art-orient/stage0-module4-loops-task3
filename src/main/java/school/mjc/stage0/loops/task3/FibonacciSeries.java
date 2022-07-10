package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int previous = 0;
        int last = 1;
        int current;
        if (lastFibonacci > 0) {
            System.out.println(0);
        }
        if (lastFibonacci > 1) {
            System.out.println(1);
        }
        for (int i = 2; i < lastFibonacci; i++) {
            current = previous + last;
            System.out.println(current);
            previous = last;
            last = current;
        }
    }
}
