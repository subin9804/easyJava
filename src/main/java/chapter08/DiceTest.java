package chapter08;

import java.util.Random;

public class DiceTest {
    public static void main(String[] args) {
        System.out.println(new Dice().roll());
    }
}

class Dice {
    public int roll() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }
}
