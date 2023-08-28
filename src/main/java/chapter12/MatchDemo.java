package chapter12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchDemo {
    public static void main(String[] args) {

        boolean b = Stream.of("a1", "a2", "a3", "c1").anyMatch(x -> x.startsWith("c"));
        System.out.println(b);

        boolean b1 = IntStream.of(1, 2, 3, 4, 5).allMatch(n -> n % 2 == 1);
        System.out.println(b1);
    }
}
