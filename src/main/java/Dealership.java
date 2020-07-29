import java.util.ArrayList;

public class Dealership implements IBuy {

    private int till;
    private ArrayList<Vehicle> carStock;

    public Dealership(int till) {
        this.till = till;
        this.carStock = new ArrayList<Vehicle>();
    }

    public int getTill() {
        return till;
    }

    public void sellVehicle(Vehicle vehicle) {
        getPaid(vehicle.getPrice());
        int index = this.carStock.indexOf(vehicle);
        this.carStock.remove(index);
    }

    public void getPaid(int amount) {
        this.till += amount;
    }

    public void buyVehicle(Vehicle vehicle) {
        addVehicle(vehicle);
        pay(vehicle.getPrice());
    }

    public void addVehicle(Vehicle vehicle){
        this.carStock.add(vehicle);
    }

    public void pay(int amount){
        this.till -= amount;
    }

    public int getNumberOfCars() {
        return this.carStock.size();
    }
}
