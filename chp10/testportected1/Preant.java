package chp10.testportected1;

public class Preant {
    String name;
    protected String id;

    protected void printprotected(){
        System.out.printf("protected 접근제한자는 패키지는 서로 다르지만 상관관계에 있는 부모의 멤버를 접근 가능");
    }

    void printDefault(){
        System.out.printf("Default 접근제한자는 패키지는 서로 다르면 부모의 멤버를 접근 불가능");
    }
}
