package chapter08;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String s = "of the people, by the people, for the people";
        StringTokenizer st = new StringTokenizer(s);
        System.out.println(st.countTokens());

        StringTokenizer st1 = new StringTokenizer(s, ","); // 토큰의 단위? 기준점?
        System.out.println(st1.countTokens());

        while(st.hasMoreTokens()) { // 뒤에 토근이 존재하지 않을 때 까지 반복
            System.out.println(st.nextToken()); // 토큰을 하나씩 출력
        }
    }
}
