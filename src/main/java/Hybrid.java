public class Hybrid extends Vehicle{

    private Engine engine;
    private ElectricMotor electricMotor;

    public Hybrid(int price, String colour, Engine engine, ElectricMotor electricMotor) {
        super(price, colour);
        this.engine = engine;
        this.electricMotor = electricMotor;
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ElectricMotor getElectricMotor() {
        return electricMotor;
    }

    public void setElectricMotor(ElectricMotor electricMotor) {
        this.electricMotor = electricMotor;
    }
}
