package chapter12;

import java.util.stream.Stream;

public class Map1Demo {
    public static void main(String[] args) {
//        Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2");
//        s1.map(x -> x.toUpperCase())
//                .forEach(System.out::println);
//
//        Stream<Integer> i1 = Stream.of(1, 2, 3, 4, 5);
//        i1.map(x -> x * 10)
//                .forEach(System.out::println);
//
//        Stream<String> s2 = Stream.of("a1", "a2", "a3");
//        s2.map(x -> x.substring(1))
//                .mapToInt(x -> Integer.parseInt(x))
//                .mapToObj(x -> "b" + x);


        // Stream.of("a1", "a2", "a3")
        Stream<String> tt = Stream.of("a1", "a2", "a3");
        tt.map(s -> s.substring(1))
                .mapToDouble(s -> Double.parseDouble(s))
                .mapToObj(s -> "a" + s)
                .forEach(System.out::println);
    }
}
