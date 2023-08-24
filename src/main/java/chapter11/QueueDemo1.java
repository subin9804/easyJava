package chapter11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("바나나");
        q.offer("사과");
        q.offer("배");
        System.out.println(q.peek());
        while(!q.isEmpty()) {
            System.out.println(q.poll() + "가 삭제되었습니다.");
        }

        System.out.println(q.peek());   // 반환할 값이 없으면 null값 반환(예외처리 필요없음)
        System.out.println(q.poll());
    }
}
