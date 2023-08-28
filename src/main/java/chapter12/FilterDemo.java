package chapter12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class FilterDemo {
    public static void main(String[] args) {
        String[] sa = {"a1", "b1", "c1", "d1"};
        Arrays.stream(sa)
                .filter(s -> s.startsWith("c"))
                .skip(1)
                .forEach(System.out::println);

        IntStream ints = new Random().ints(0, 10);
        ints.limit(10)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);



        // nations 중 인구가 1억 이상인 나라 2개만 출력하기
        Nation.nations.stream()
                .filter(x -> x.getPopulation() >= 100)
                .limit(2)
                .forEach(System.out::println);

    }

}
