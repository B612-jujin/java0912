package chp08.ex8_5;

public class Student {
    // 공유(static)영역 할당: 클래스변수
    static int count;

    // 힙(non-static) 영역 할당: 인스턴스변수
    int id;
    String name;


    //생성자
    Student(int _id, String _name) {
        count++;
        id = _id;
        name = _name;
    }
}