import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CarTest {
    Car car;
    Engine engine;

    @Before
    public void before() {
        engine = new Engine(70, 1500, 60);
        car = new Car(10000, "red", engine);

    }

    @Test
    public void hasPrice(){
        assertEquals(10000, car.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("red", car.getColour());
    }

//    @Test
//    public void hasEngine(){
//        assertEquals(70, car.getEngine().getFullTank());
//        assertEquals(1500, car.getEngine().getSize());
//    }

}
