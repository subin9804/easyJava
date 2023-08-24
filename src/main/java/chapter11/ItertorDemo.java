package chapter11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ItertorDemo {
    public static void main(String[] args) {
        Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + "-");
        }
        System.out.println();

        // 다시 출력하고 싶다면 iterator를 다시 만들어야 한다.
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + "-");
        }
        System.out.println();

    }
}
