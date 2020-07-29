
public class Car extends Vehicle {

    private IRun iRunEngine;

    public Car(int price, String colour, IRun iRunEngine){
        super(price, colour);
        this.iRunEngine = iRunEngine;
    }

    public IRun getEngine(){
        return this.iRunEngine;
    }

}
