import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HybridTest {

    Hybrid hybrid;
    Engine engine;
    ElectricMotor electricMotor;

    @Before
    public void before(){
        engine = new Engine(60, 1300, 60);
        electricMotor = new ElectricMotor(3);
        hybrid = new Hybrid(14000, "yellow", engine, electricMotor);
    }

    @Test
    public void hasPrice(){
        assertEquals(14000, hybrid.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("yellow", hybrid.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals(60, hybrid.getEngine().getFullTank());
        assertEquals(1300, hybrid.getEngine().getSize());
    }

    @Test
    public void hasElectricMotor(){
        assertEquals(100, hybrid.getElectricMotor().getBattery());
    }

}
