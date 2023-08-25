package chapter11;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> fruits = Map.of("사과", 5, "바나나", 3, "딸기", 7, "배", 5);
        System.out.println(fruits);
        System.out.println(fruits.size() + "종류의 과일이 있습니다.");

        fruits.put("키위", 5);

        Set<String> keys = fruits.keySet();
        System.out.println(keys);
        for(String key : keys) {
            System.out.println(key);
        }

        Collection<Integer> values = fruits.values();
        System.out.println(values);
    }
}
