package HomeworkLection8.Exercise1;

public class Square extends Shape {

    public Square() {
    }

    @Override
    public double getArea(double side) {
        return side * side;
    }

    @Override
    public double getPerimeter(double side) {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square";
    }
}
