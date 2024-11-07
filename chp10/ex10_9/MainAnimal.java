package chp10.ex10_9;

public class MainAnimal {
    public static void main(String[] args) {
        //추상클래스는 new 연산자로 객체 생성이 불가능하다.
        //Animal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("말티즈");
        dog.eat("뼈다귀");
        dog.cry("왈왈");
        dog.sleep(3);
        dog.wag();

        cat.setName("페르시안");
        cat.cry("야옹");
        cat.eat("생선");
        cat.sleep(3);
        cat.Grooming();

        Animal animal = new Dog();
//업케스팅을 하면 부모클래스의 모든 맴버 사용 가능
        //자식슬래스의 맴버는 부모클래스의 메소드를 오버라이딩하여만 사용할 수 있다.
        //animal.;
    }
}
