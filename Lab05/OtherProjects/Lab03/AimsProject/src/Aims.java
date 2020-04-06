// package src;
public class Aims {
    public static void main(String[] args) {
        Order anOrder = new Order();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);

        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion");
        dvd2.setCategory("Animationss");
        dvd2.setCost(20.32f);
        dvd2.setDirector("Roger Allersss");
        dvd2.setLength(200);

        anOrder.addDigitalVideoDisc(dvd2);

        System.out.print("Total cost is: ");
        System.out.println(anOrder.totalCost());
    }
}