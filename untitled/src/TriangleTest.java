import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    Triangle triangle1;

    @BeforeEach
    void setUp(){triangle1= new Triangle(3,3,3,6,7,3);}

    @Test
    void getArea(){
        triangle1.getArea(3,3,3,6,7,3);
        assertEquals(triangle1.area, 6);
    }

    @Test
    void getCircumference(){
        triangle1.getCircumference();
        assertEquals(triangle1.circumference, 12);
    }

    @Test
    void hasPointInside(){
        triangle1.hasPointInside(4,4);
        assertEquals(triangle1.isInside, false);
    }

}