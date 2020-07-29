import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    Car car;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine(100, 1500);
        car = new Car(5000, "blue", engine);
        customer = new Customer();
    }

    @Test
    public void hasMoney(){
        assertEquals(15000, customer.getWallet());
    }

    @Test
    public void canBuyCar(){
        customer.buyVehicle(car);
        assertEquals(1, customer.getNumberOfCars());
        assertEquals(10000, customer.getWallet());
    }


}
