import com.app.Shapes;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapesTest {

    @Test
    public void testCompute() {
        Shapes shapes = new Shapes();

        assertEquals(4.0, shapes.computeSquareArea(2.0), 0.0);

        assertEquals(12.56, shapes.computeCircleArea(2.0), 0.01);
    }


}
