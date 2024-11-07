package chp10.ex10_9;

public class Dog extends Animal {


    @Override
    public void eat(String food) {
        System.out.println(getName()+"가(이)" + food+" 를 먹는다");
    }

    @Override
    public void cry(String sound) {
        System.out.printf("%s 가(이) %s 소리를 낸다.\n",getName(),sound);
    }

    public void wag(){
        System.out.println("꼬리를 살랑살랑 흔든다.");
    }
}
