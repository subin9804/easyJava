package challengeThisisjava16;

public class Example {
    public static double calc(Calculator fun) {
        double x = 10;
        double y = 4;
        return fun.apply(x, y);
    }
    public static void main(String[] args) {
        double result = calc( (x, y) -> (x / y) );
        System.out.println("result: " + result);
    }

}
@FunctionalInterface
interface Calculator {
    double apply(double x, double y);
}
