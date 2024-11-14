package chp11.ex11_5;

public class Bicycle implements Vehicle {
    @Override
    public void horn() {
        System.out.println("따르릉 따르릉");
    }
    //인터페이스에 정의된 static 메소드 stop는 오버라이딩 할 수 없다.
    //인터페이스의 static 오버라이딩은 안되지만 현재 클래스에서 정의는 할 수 있다.
    //사용할 때는 Bicycle.stop()로 개별적으로 해야 한다.#E71D36
    static public void stop(String place) {
        System.out.printf("%s 에 멈춰섰다.\n",place);
    }

}
