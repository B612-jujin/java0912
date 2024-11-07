package chp10.ex10_10;

public class Item {
    private String Name;
    private int price;
    private int power;

//필드명 = 변수명일 때 사용하는 this 키워드!
    public Item(String name) {
        this.Name = name;

    }

    public Item(String name, int price) {
        this(name);
        this.price = price;
    }

    public Item(String name, int price, int power) {
        this(name ,price);
        this.price = price;
        this.power = power;
    }

    public Item() {
        this("아무것도 아니야!", 0);
        System.out.println("기본 생성자가 호출됨");

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
