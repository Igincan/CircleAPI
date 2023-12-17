package igincan.circleapi.classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void testIsInside() {
        Point center = new Point(0, 0);
        Circle circle = new Circle(center, 5);

        Point pointInside = new Point(3, 4);
        assertTrue(circle.is_inside(pointInside));

        Point pointOutside = new Point(6, 6);
        assertFalse(circle.is_inside(pointOutside));
    }

}
