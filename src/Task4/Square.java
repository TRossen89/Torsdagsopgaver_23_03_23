package Task4;

public class Square implements Shape {

    double length_of_side;

    public Square(double length_of_side) {
        this.length_of_side = length_of_side;
    }

    @Override
    public double getArea() {

        double area = length_of_side * length_of_side;
        return area;
    }
}
