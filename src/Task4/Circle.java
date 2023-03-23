package Task4;

public class Circle implements Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {

        double pi = 3.14;

        double area = pi * (this.radius*this.radius);


        return area;
    }
}
