package chp10.ex10_4;

public class MainSquare {
    public static void main(String[] args) {
        //Object, Shape, Square 객체의 필드와 메소드 접근 가능
        Square square = new Square();
        square.name ="정사각형";
        //Shape 객체의 필드와 메소드 접근 가능(예외적으로 Square 객체의 맴버를 접근할 수도 있다.)
        Shape shape = new Square();
        //
    }
}
