package chp10.ex10_11;

public class item2 {

    String name;

    int price;

    public item2() {
        this.name = "기본";
        System.out.println("item2의 기본생성자 호출됨");

    }

    public item2(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
