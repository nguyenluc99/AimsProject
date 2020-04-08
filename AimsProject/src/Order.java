public class Order {
    public static final int MAX_LIMITTED_ITEMS = 10;
    public static final int MAX_LIMITTED_ORDERS = 5;
    private static int nbOrders = 0;
    private int nbItem = 0;
    private float cost = 0;
    private MyDate dateOrdered = new MyDate("tenth", "May", 1999);
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_LIMITTED_ITEMS];

    public Order() {
        super();
        if (Order.nbOrders >= Order.MAX_LIMITTED_ORDERS)
            throw null;
        Order.nbOrders++;
    }

    public static void main(String[] args) {

    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        this.itemOrdered[this.nbItem] = dvd;
        this.nbItem++;
        this.cost += dvd.getCost();
    }

    public float totalCost() {
        return this.cost;
    }

    public int numberOfItem() {
        return this.nbItem;
    }

    public DigitalVideoDisc getItem(int num) {
        return this.itemOrdered[num];
    }
    public void setDate(MyDate date) {
        this.dateOrdered = date;
    }

    public void printOrder() {
        System.out.println("***************ORDER***************");
        // this.dateOrdered.print();
        this.dateOrdered.printWithFormat("mmm dd,yyyy");
        DigitalVideoDisc luckyItem = this.getALuckyItem();
        System.out.println("Order Items:");
        for (int i = 0; i < this.nbItem; i++) {
            System.out.println(i + 1 + ". " + this.itemOrdered[i].getTitle() + " - " + this.itemOrdered[i].getCategory()
            + " - " + this.itemOrdered[i].getDirector() + " - " + this.itemOrdered[i].getLength() + " - "
            + this.itemOrdered[i].getCost());
        }
        System.out.println("Total cost:" + this.cost);
        this.cost -= luckyItem.getCost();
        System.out.println("Lucky item: " + luckyItem.getTitle() + " - " + luckyItem.getCategory()
                    + " - " + luckyItem.getDirector() + " - " + luckyItem.getLength() + " - "
                    + luckyItem.getCost());
        System.out.println("Final cost:" + this.cost);
        System.out.println("***********************************");
    }

    private DigitalVideoDisc getALuckyItem() {
        double ran = java.lang.Math.random() * this.nbItem;
        int rani = (int) ran;
        return this.itemOrdered[rani];
    }
}