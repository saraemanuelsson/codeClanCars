public class Engine {

    private int fullTank;
    private int size;

    public Engine(int fullTank, int size) {
        this.fullTank = fullTank;
        this.size = size;
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

    public void setSize(int size) {
        this.size = size;
    }
}
