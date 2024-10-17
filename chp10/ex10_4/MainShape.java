package chp10.ex10_4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainShape {
    public static void main(String[] args) {

        Square s = new Square();
        s.name = "정사각형";
        Triangle t = new Triangle();
        t.name = "삼각형";
        Circle c = new Circle();
        c.name = "원";

        Shape s1 = new Square();

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(s);
        shapes.add(t);
        shapes.add(c);

        for (int i = 0; i < shapes.size(); i++) {
            System.out.printf("index Number : %d Shape: %s\n",i,shapes.get(i).name);
        }

    }
}
