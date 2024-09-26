package chp08.ex8_9;

public class CoffeeTestMain {
    public static void main(String[] args) {
        CoffeeTest c = new CoffeeTest("아메리카노", 3000);
        System.out.printf("%s(%d원)->", c.getName(),c.getPrice());
        c.setPrice(c.getPrice()+500);//500원 가격인상
        System.out.printf("%s(%d원)", c.getName(),c.getPrice());
    }
}
