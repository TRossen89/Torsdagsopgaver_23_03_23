package Task4;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeBuilder {

    ArrayList<Shape> collection_of_shapes;

    public ShapeBuilder(ArrayList<Shape> collection_of_shapes) {
        this.collection_of_shapes = collection_of_shapes;
    }

    public void addShape(Shape a_shape){

        collection_of_shapes.add(a_shape);

    }


    public double getTotalArea(){

        double total_area = 0;
        for (Shape a_shape: collection_of_shapes) {

            total_area += a_shape.getArea();

        }

        return total_area;


    }

    public ArrayList<Shape> getCollection_of_shapes() {
        return collection_of_shapes;
    }

    public void setCollection_of_shapes(ArrayList<Shape> collection_of_shapes) {
        this.collection_of_shapes = collection_of_shapes;
    }
}
