package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        String number = "";
        for (int i = 0; i < lengthOfLastNumber; i++) {
            number += "9";
            int value = Integer.parseInt(number);
            sum += value;
        }
        System.out.println(sum);
    }
}
