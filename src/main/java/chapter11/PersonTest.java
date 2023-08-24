package chapter11;

import java.util.HashSet;
import java.util.Set;

public class PersonTest {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        set.add(new Person("김영공", 20));
        set.add(new Person("최고봉", 48));
        set.add(new Person("나자바", 25));
        set.add(new Person("김등생", 16));
        set.add(new Person("김영공", 20));

        for(Person p : set) {
            System.out.print(p + " ");
        }
    }
}

class Person{
    // 필드
    String name;
    int age;
    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // toString 메서드 오버라이딩
    @Override
    public String toString() {
        return "Person["+name+" : " + age + "]";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Person person){
            if(this.hashCode() == person.hashCode()){
                return true;
            }
        }
        return false;
    }
}