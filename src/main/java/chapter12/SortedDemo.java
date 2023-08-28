package chapter12;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {
    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("a1", "a2", "a3");

        s1.sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.hashCode() - o1.hashCode();
            }
        }).forEach(Util::print);


        Nation.nations.stream()
                .sorted(Comparator.comparing(x -> x.getName()))
                .map(x -> x.getName())
                .forEach(Util::printWithParenthesis);
        System.out.println();

        Nation.nations.stream()
                .sorted(Comparator.comparing(x -> x.getGdpRank()))
                .map(x -> x.getName())
                .forEach(Util::print);
        System.out.println();
    }

}
