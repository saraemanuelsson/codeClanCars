import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EngineTest {
    Engine engine;

    @Before
    public void before(){
        engine = new Engine(70, 1500, 40);
    }
    
    @Test
    public void canBurnFuel(){
        engine.run(50);
        assertEquals(69, engine.getFullTank());
    }

}
