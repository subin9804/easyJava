package chapter09;

// 컴파일에러 처리
public class CheckedDemo {
    public static void main(String[] args) throws InterruptedException {
//        try {
//            System.out.println("1초간 쉽니다.");
//            Thread.sleep(1000);
//            System.out.println("1초간 쉽니다.");
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("1초간 쉽니다.");
        Thread.sleep(1000);
        System.out.println("1초간 쉽니다.");
    }

}
