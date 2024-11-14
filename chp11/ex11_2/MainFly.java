package chp11.ex11_2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainFly {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Helicopter helicopter = new Helicopter();
        Rooket rooket = new Rooket();
        //배열에 각 객체의 참조값을 저장
        Flyable[] flybles={bird,helicopter,rooket};

        for(Flyable flyable:flybles){
            flyable.Fly();

        }

        ArrayList<Flyable> flyableList=new ArrayList<Flyable>();
        flyableList.add(bird);
        flyableList.add(helicopter);
        flyableList.add(rooket);
        for(Flyable flyable:flyableList){
            flyable.Fly();
        }

    }
}
