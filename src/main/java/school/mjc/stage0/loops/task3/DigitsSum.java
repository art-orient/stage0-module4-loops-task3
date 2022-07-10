package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        t = Math.abs(t);
        int len = ("" + t).length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += t % 10;
            t = t / 10;
        }
        System.out.println(sum);
    }
}
