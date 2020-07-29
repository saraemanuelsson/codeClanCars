public abstract class Vehicle {

    protected int price;
    protected String colour;

    public Vehicle(int price, String colour){
        this.price = price;
        this.colour = colour;
    }

    public int getPrice(){
        return this.price;
    }

    public String getColour(){
        return this.colour;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
