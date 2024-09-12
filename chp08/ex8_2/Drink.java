package chp08.ex8_2;

public class Drink {
    String name;
    int price;

    Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    Drink() {
        name = "";
        price = 0;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
