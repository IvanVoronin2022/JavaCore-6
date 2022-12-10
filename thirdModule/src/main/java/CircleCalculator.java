public class CircleCalculator {
    public static final double PI = 3.14;

    public static double calculateCircleArea(int value) {
        double result = value * value * PI;
        return result;
    }

    public static double calculateCircleLength(int value) {
        double result = 2 * value * PI;
        return result;
    }
}
