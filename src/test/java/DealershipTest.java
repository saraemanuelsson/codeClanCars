import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class DealershipTest {
    
    Dealership dealership;
    Car car;
    Engine engine;
    
    @Before
    public void before(){
        dealership = new Dealership(500);
        engine = new Engine(70, 1500);
        car = new Car(10000, "red", engine);
    }
    
    @Test
    public void hasMoneyInTill(){
        assertEquals(500, dealership.getTill());
    }

    @Test
    public void canAddCarToStock(){
        dealership.buyVehicle(car);
        assertEquals(1, dealership.getNumberOfCars());
    }

    @Test
    public void canSellCar(){
        dealership.addVehicle(car);
        dealership.addVehicle(car);
        dealership.sellVehicle(car);
        assertEquals(10500, dealership.getTill());
        assertEquals(1, dealership.getNumberOfCars());
    }



}
