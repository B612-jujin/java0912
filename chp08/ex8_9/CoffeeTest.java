package chp08.ex8_9;

public class CoffeeTest {
    private String name;
    private int price;

    public CoffeeTest(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


