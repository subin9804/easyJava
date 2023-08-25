package chapter10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionalInterface3Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(Integer i : list) {
            System.out.println(i);
        }

        list.forEach(System.out::println);

        list.removeIf(i -> i % 2 == 0);
        list.forEach(System.out::println);

        list.replaceAll(i -> i*10);
        list.forEach(System.out::println);

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 65);
        map.put("a", 97);

        map.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));

        Map<String, String> map1 = Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion");

        Map<String, String> map2 = new HashMap<>(map1);
        System.out.println(map1);
        map2.replaceAll((K, V) -> V.toUpperCase());
        System.out.println(map2);

    }
}
