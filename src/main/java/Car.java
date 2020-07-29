
public class Car extends Vehicle {

    private Engine engine;

    public Car(int price, String colour, Engine engine){
        super(price, colour);
        this.engine = engine;
    }

    public Engine getEngine(){
        return this.engine;
    }

}
