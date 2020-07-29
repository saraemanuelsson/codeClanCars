import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ElectricTest {

    Electric electric;
    ElectricMotor electricMotor;

    @Before
    public void before() {
        electricMotor = new ElectricMotor(2);
        electric = new Electric(15000, "blue", electricMotor);

    }

    @Test
    public void hasPrice(){
        assertEquals(15000, electric.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", electric.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals(100, electric.getElectricMotor().getBattery());
    }
}
