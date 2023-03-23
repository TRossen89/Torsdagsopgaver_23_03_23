package Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle a_circle;
    @BeforeEach
    void setUp() {

        a_circle = new Circle(3.2);


    }

    @Test
    void getArea() {

        assertEquals(32.1536, a_circle.getArea());
    }
}