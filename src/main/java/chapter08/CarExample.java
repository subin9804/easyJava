package chapter08;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        Car.Tire tire = myCar.new Tire();
        Car.Engine engine = new Car.Engine();
    }

}

class Car {
    // 인스턴스 멤버클래스
    class Tire{}

    // 정적 멤버클래스
    static class Engine{}
}