package HomeworkLection8.Exercise1;

public class Circle extends Shape {

    public Circle() {
    }

    @Override
    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
