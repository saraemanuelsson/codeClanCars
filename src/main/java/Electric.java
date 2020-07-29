public class Electric extends Vehicle {

    private ElectricMotor electricMotor;

    public Electric(int price, String colour, ElectricMotor electricMotor){
        super(price, colour);
        this.electricMotor = electricMotor;
    }

    public ElectricMotor getElectricMotor() {
        return electricMotor;
    }

    public void setElectricMotor(ElectricMotor electricMotor) {
        this.electricMotor = electricMotor;
    }
}
