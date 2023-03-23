package Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShapeBuilderTest {

    ShapeBuilder a_shape_builder;
    @BeforeEach
    void setUp() {

        ArrayList<Shape> a_collection_of_shapes = new ArrayList<>(Arrays.asList(new Circle(5),
                new Square(5), new Square(10)));



        a_shape_builder = new ShapeBuilder(a_collection_of_shapes);


    }

    @Test
    void getTotalArea() {

        assertEquals(203.5, a_shape_builder.getTotalArea());
    }
}