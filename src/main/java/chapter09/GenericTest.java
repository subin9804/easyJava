package chapter09;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
//        int i = 30;
        ArrayList<Integer> nums = new ArrayList();
//        nums.add(10);   // Integer로 10이 Auto-boxing 됨
//        nums.add(i);
//        nums.add(3.14); // Double로 3.14가 Auto-boxing 됨
//        nums.add("hello");


        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) instanceof Integer) {
                System.out.println((Integer) (nums.get(i)) * 2);

            }
        }

        String s = "world";
        ArrayList<String> strs = new ArrayList();
        strs.add("hello");   // Integer로 10이 Auto-boxing 됨
        strs.add(s);
        strs.add("");
        strs.add(null);

        for (int i = 0; i < strs.size(); i++) {
            String getStr = strs.get(i);
            if(getStr != null) {
                System.out.println(getStr.length());
            } else {
                System.out.println("아무것도 없습니다.");
            }
        }
    }
}
