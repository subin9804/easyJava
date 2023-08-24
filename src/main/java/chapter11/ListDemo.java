package chapter11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    // 배열 -> Lost
    public static void main(String[] args) {
        String[] animals = {"호랑이", "사자", "사슴", "곰"};
        List<String> list = Arrays.asList(animals);
        System.out.println(list);

        list.set(3, "앵무새");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + ",");
        }
        System.out.println();

        //list.add(0,"바다표범");  abstractList 라 사용 불가
        String[] animals2 = list.toArray(new String[0]);
        System.out.println(Arrays.toString(animals2));
        for (String ani : animals2) {
            System.out.print(ani + " : ");
        }
        System.out.println();
        Arrays.sort(animals2);
        System.out.println(Arrays.toString(animals2));

        list.set(1, "바다표범");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(list);
    }
}