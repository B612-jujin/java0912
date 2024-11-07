package chp10.testportected1;

import chp10.testportected1.test.Child;

public class MainChild {
    public static void main(String[] args) {
        Child child = new Child();
        child.testPro();
        System.out.printf("\nParent iD는 "+child.id);
    }
}
