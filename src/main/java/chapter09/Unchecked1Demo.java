package chapter09;

import java.util.StringTokenizer;

// RuntimeException 예시
// NoSuchElementException
public class Unchecked1Demo {
    public static void main(String[] args) {
        String s = "Time is money";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println(st.nextToken());
    }
}
