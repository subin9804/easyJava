package chapter09;

// RuntimeException 예시
// ArrayIndexOutOfBoundsException
public class Unchecked2Demo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        System.out.println(array[3]);
    }

}
