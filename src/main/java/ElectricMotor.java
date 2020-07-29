public class ElectricMotor implements IRun {

    private int battery;
    private int batteryUsagePerMile;

    public ElectricMotor(int batteryUsagePerMile) {
        this.battery = 100;
        this.battery = batteryUsagePerMile;
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


    public void emptyBattery(int deplete) {
        if (this.battery - deplete < 0) {
            this.battery = 0;
        }
        this.battery -= deplete;
    }

    public void run(int distance){
        int chargedUsed = distance / this.batteryUsagePerMile;
        this.battery -= chargedUsed;
    }

    public int getBatteryUsagePerMile() {
        return this.batteryUsagePerMile;
    }



}
