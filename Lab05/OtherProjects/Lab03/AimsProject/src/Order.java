// package src;
public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int numOfOrder = 0;
    private float cost = 0;

    public static void main(String[] args) {

    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        this.itemOrdered[this.numOfOrder] = dvd;
        this.numOfOrder++;
        this.cost += dvd.getCost();
    }

    public float totalCost() {
        return this.cost;
    }
}