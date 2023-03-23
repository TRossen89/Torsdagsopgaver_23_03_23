package Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {


    Square a_square;
    @BeforeEach
    void setUp() {

        a_square = new Square(5.5);

    }

    @Test
    void getArea() {

        assertEquals(30.25, a_square.getArea());

    }
}