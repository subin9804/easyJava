package chapter12;

import java.util.Optional;

public class Optional2Demo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = null;

        Util.print(Optional.ofNullable(s1));
        Util.print(Optional.ofNullable(s2));


    }
}
