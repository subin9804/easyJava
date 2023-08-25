package chapter11;

import java.util.*;

public class MaxScore {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        List<Integer> d = map.values().stream().toList();
        List<Integer> a = d.stream().sorted().toList();
        List<String> names = map.keySet().stream().toList();

        int maxIndex = d.indexOf(maxScore);
        maxScore = a.get(a.size() - 1);
//        name = names.get(maxIndex);

        System.out.println(maxScore + "," + maxIndex);


        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == maxScore) {
                name = entry.getKey();
            }

        }

    }

}
