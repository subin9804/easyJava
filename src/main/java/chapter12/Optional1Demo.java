package chapter12;

import java.util.OptionalDouble;

public class Optional1Demo {
    public static OptionalDouble divide(double x, double y) {
//        return OptionalDouble.of(x/y);
        return (y == 0) ? OptionalDouble.empty() : OptionalDouble.of(x/y);
    }

    public static void main(String[] args) {
        OptionalDouble divide = divide(10, 2);
        System.out.println(divide);

        // 직접 언박싱 필요
        System.out.println(divide.getAsDouble());

        System.out.println(10/2.0);

        OptionalDouble divideZero = divide(10, 0);
        System.out.println(divideZero);
    }
}
