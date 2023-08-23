package chapter09;

import java.util.ArrayList;

public class GenericInheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Beer> a1 = new ArrayList<>();
        ArrayList<Boricha> a2 = new ArrayList<>();
        ArrayList<Beverage> a3 = new ArrayList<>();

        a3.add(new Beverage());
        a3.add(new Boricha());
        a3.add(new Beer());

        Beer beverage = (Beer) a3.get(1);

        System.out.println(beverageTest(a3));
//        beverageTest(a2);
    }

    // 상속관계를 가진 클래스들이 배열을 만들경우 상속이 이어지지 않기 때문에
    // 자동 형변환이 되지 않음.
    static boolean beverageTest(ArrayList<Beverage> array) {
        return true;
    }
}
