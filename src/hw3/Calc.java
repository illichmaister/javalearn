package hw3;

public class Calc {
    public static int subt(int min, int sub) {
        int diff = min - sub;
//        System.out.println(diff);
        return diff;
    }

    public static int multiplication(int multiplier1, int multiplier2) {
        int multiply = multiplier1 * multiplier2;
        return multiply;
    }

    public void substractionDoubler(int num1, int num2) {
        System.out.println(subt(num1, num2) * 2);
    }

    public void multiplicationDoubler(int num1, int num2) {
        System.out.println(multiplication(num1, num2) * 2);
    }
}
