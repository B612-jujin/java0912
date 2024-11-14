package chp11.ex11_1;

public interface Phone {


     String PROUDUCT_NAME ="apple";
    //인터페이스는 상수, 추상메소드, default 메소드 등을 사용할 수 있습니다.
    // 상수는 final, static 키워드를 생략가능합니다.

    public abstract void callPhone(String PhoneNumber);

    //추상 메소드는 public adstract를 생략 가능합니다.
    void receivePhone(String PhoneNumber);
}
