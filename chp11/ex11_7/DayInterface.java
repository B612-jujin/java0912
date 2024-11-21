package chp11.ex11_7;

public interface DayInterface {
    //인터패이스에서는 상수만 사용되기 때문에 public static final를 생략할 수 있다.
//상수는 대문자 여러 글자가 들어가면 _를 붙여 표시하자 ex:맛있는_사과
    //final = 초기화 후 다른값으로 변경할 수 없다.
    //static은 인터패이스명을 .앞에 붙여서 상수를 사용할 수 있다.
    String MONDAY = "월요일";
    public static final String TUSEDAY ="화요일";
}
