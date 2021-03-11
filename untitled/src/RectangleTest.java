import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectangle;

    @BeforeEach
    void setUp(){rectangle= new Rectangle(1,1,8,1,1,5,8,5);}

    @Test
    void getArea(){
        rectangle.getArea();
        assertEquals(rectangle.area, 28);
    }

    @Test
    void getCircumference(){
        rectangle.getCircumference();
        assertEquals(rectangle.circumference, 22);
    }

    @Test
    void hasPointInside(){
        rectangle.hasPointInside(1,7);
        assertEquals(rectangle.isInside, false);
    }

    @Test
    void hasPointInside2(){
        rectangle.hasPointInside(3,3);
        assertEquals(rectangle.isInside, true);
    }
}