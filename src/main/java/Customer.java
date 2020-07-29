import java.util.ArrayList;

public class Customer implements IBuy {

    private int wallet;
    private ArrayList<Vehicle> myCars;

    public Customer(){
        this.wallet = 15000;
        this.myCars = new ArrayList<Vehicle>();
    }

    public int getWallet(){
        return this.wallet;
    }

    public void buyVehicle(Vehicle vehicle){
        this.myCars.add(vehicle);
        pay(vehicle.getPrice());
    }

    public int getNumberOfCars() {
        return this.myCars.size();
    }

    public void pay(int amount) {
        this.wallet -= amount;
    }

}
