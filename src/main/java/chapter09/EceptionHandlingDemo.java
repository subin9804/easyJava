package chapter09;

public class EceptionHandlingDemo {
    public static void main(String[] args) {

        int i = 0;
        String s = null;

        try {
            s.length();
            int res = 10/i;

        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (NullPointerException e) {
            System.out.println("문자열의 내용이 없습니다.");   // 처음으로 걸린 에러만 처리되고 종료. 따라서 범위가 좁은 에러부터 나열
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }

    }
}
