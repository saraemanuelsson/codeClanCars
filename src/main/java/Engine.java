public class Engine implements IRun {

    private int fullTank;
    private int size;
    private int fuelConsumptionRate;

    public Engine(int fullTank, int size, int fuelConsumptionRate) {
        this.fullTank = fullTank;
        this.size = size;
        this.fuelConsumptionRate = fuelConsumptionRate;
    }

    public int getFullTank() {
        return fullTank;
    }

    public void setFullTank(int fullTank) {
        this.fullTank = fullTank;
    }

    public int getSize() {
        return size;
    }

    public int getFuelConsumptionRate(){
        return this.fuelConsumptionRate;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void run(int distance){
        int fuelUsed = distance / fuelConsumptionRate;
        this.fullTank -= fuelUsed;
    }
}
