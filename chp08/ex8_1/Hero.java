package chp08.ex8_1;

public class Hero {
    String name;
    int power;
    int speed;

    public Hero(String name){
        this.name = name;
    }

    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Hero(String name, int power, int speed) {
        this.name = name;
        this.speed = speed;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", speed=" + speed +
                '}';
    }
    //문자열 형태로 반환ㅎ
}
