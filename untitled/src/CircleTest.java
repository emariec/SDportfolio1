import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    Circle circle;

    @BeforeEach
    void setUp(){circle= new Circle(3,4,2);}

    @Test
    void getArea() {
        circle.getArea();
        assertEquals(circle.area, 12.566370614359172);
    }
    @Test
    void getCircumference() {
        circle.getCircumference();
        assertEquals(circle.circumference, 12.566370614359172);
    }

    @Test
    void hasPointInside(){
        circle.hasPointInside(1,1);
        assertEquals(circle.isInside, false);
    }
}