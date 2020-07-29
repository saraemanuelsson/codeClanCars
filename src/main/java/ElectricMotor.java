public class ElectricMotor {

    private int battery;

    public ElectricMotor() {
        this.battery = 100;
    }

    public int getBattery() {
        return battery;
    }

    public void chargeBattery(int charge) {
        if (this.battery + charge > 100) {
            this.battery = 100;
        }
        this.battery += charge;
    }

}
