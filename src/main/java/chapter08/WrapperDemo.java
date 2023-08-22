package chapter08;

public class WrapperDemo {
    public static void main(String[] args) {
        // 자동으로 boxing
        Integer bi = Integer.valueOf(10);
        System.out.println(bi);
        bi = 20;
        System.out.println(bi);
        float f = Float.parseFloat("3.14");
        System.out.println(f);
        int i = Integer.parseInt("3");
        System.out.println(i);
    }
}
