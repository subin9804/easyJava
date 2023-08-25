package chapter10;

import java.util.function.Predicate;

public class FuntionalInterface2Demo {

    public static void main(String[] args) {
        Predicate<String> isEmptyStr = s -> s.length() == 0;
        Predicate<Integer> isZero = i -> i == 0;

        System.out.println(isEmptyStr.test(""));
        System.out.println(isEmptyStr.test("notempty"));

        System.out.println(isZero.test(1));
        System.out.println(isZero.test(0));
//
//        Supplier;
//        Consumer;
//        Predicate;


    }
}
