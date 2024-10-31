package chp10.ex10_6;

public class MainController {
    public static void main(String[] args) {

        Square square = new Square();
        square.setWidth(7);
        square.name = "정사각형";

        Triangle triangle = new Triangle();
        triangle.setHeight(15);
        triangle.setBase(9);
        triangle.name = "삼각형";

        Circle circle = new Circle();
        circle.setRadius(5);
        circle.name = "원";

/*        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(square);
        shapes.add(triangle);
        shapes.add(circle);*/
        Shape[] shapes = {square, triangle, circle};
        viewShapes(shapes);
    }

    public static void viewShapes(Shape[] arrList) {
        for (Shape s : arrList) {
            System.out.printf("%s 의 면적은 %.2f㎠입니다.\n", s.name, s.area());

        }
    }
}
