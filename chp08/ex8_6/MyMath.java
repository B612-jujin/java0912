package chp08.ex8_6;

public class MyMath {
    //공유영역 (STARIC)클래스 메소드
    static double max(double a, double b) {return (a > b ? a : b);}
    static double min(double a, double b) {return (a < b ? a : b);}
}
