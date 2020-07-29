import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricMotorTest {
    ElectricMotor electricMotor;

    @Before
    public void before(){
        electricMotor = new ElectricMotor(1);
    }
    
    @Test
    public void canCharge(){
        electricMotor.emptyBattery(50);
        electricMotor.chargeBattery(40);
        assertEquals(90, electricMotor.getBattery());
    }

//    @Test
//    public void canRun(){
//        electricMotor.run(2);
//        assertEquals(98, electricMotor.getBattery());
//    }
}
