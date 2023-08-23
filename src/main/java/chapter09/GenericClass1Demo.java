package chapter09;

import java.util.ArrayList;

// 제네릭 - 타입 안정성을 제공. 형변환이 불필요하여 코드가 간단해짐.
public class GenericClass1Demo {
    public static void main(String[] args) {
        ArrayList<Boricha> arrayListBoricha = new ArrayList<>();
        arrayListBoricha.add(new Boricha());
//        arrayListBoricha.add(new Beer());

        ArrayList<Beer> arrayListBeer= new ArrayList<>();
//        arrayListBeer.add(new Boricha());
        arrayListBeer.add(new Beer());

        Cup c = new Cup();
        c.setBeverage(new Boricha());
        if(c.getBeverage() instanceof Boricha) {
            Boricha boricha = (Boricha) c.getBeverage();

        } else if(c.getBeverage() instanceof Beer) {
            Beer beer = (Beer) c.getBeverage();
        }

        c.setBeverage(new Beer());
        Beer beer = (Beer) c.getBeverage();

        c.setBeverage(new Beverage());
        c.setBeverage(new Object());    // 무엇이든지 가능
//        beer = (Beer) c.getBeverage();

        Cup<Boricha> borichaCup = new Cup();
        borichaCup.setBeverage(new Boricha());
        Boricha boricha = borichaCup.getBeverage();

        Cup<Beer> beerCup = new Cup();
        beerCup.setBeverage(new Beer());
        beer = beerCup.getBeverage();

    }
}

class Beverage { }

class Boricha extends Beverage { }

class Beer extends Beverage { }

class Cup<T> {
    private T beverage;

    public T getBeverage() {
        return beverage;
    }

    public void setBeverage(T beverage) {
        this.beverage = beverage;
    }
}