package chp10.ex10_6;

public class Shape {
    String name;
    double area(){
        return 0;
    }
}
class Square extends Shape{
    private double width;
    @Override
    double area() {
        return Math.pow(width,2);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

class Triangle extends Shape{
    private int base;
    private int height;

    @Override
    double area() {
        return base*height/2.0;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
class Circle extends Shape{
    private double radius;

    @Override
    double area(){
        return Math.pow(radius,2) *Math.PI ;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
