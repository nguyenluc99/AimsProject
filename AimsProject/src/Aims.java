public class Aims {
    public static void main(String[] args) {
        Order order1 = Order.createOrder();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc();
        dvd1.setCategory("aaaaaaaaaaa");
        dvd1.setCost(19.95f);
        dvd1.setDirector("director");
        dvd1.setLength(87);
        order1.addMedia(dvd1);
    // "The Lion King"
    // "The Lion"
    // "The man"
    // "The Lie"
        DigitalVideoDisc dvd2 = new DigitalVideoDisc();
        dvd2.setCategory("Animationss");
        dvd2.setCost(20.32f);
        dvd2.setDirector("Roger Allersss");
        dvd2.setLength(200);
        order1.addMedia(dvd2);

        order1.printOrder();

        Order order2 = Order.createOrder();
        DigitalVideoDisc dvd3 = new DigitalVideoDisc();
        dvd3.setCategory("romeo");
        dvd3.setCost(201f);
        dvd3.setDirector("juliet");
        dvd3.setLength(200);
        order2.addMedia(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc();
        dvd4.setCategory("dragon");
        dvd4.setCost(20f);
        dvd4.setDirector("talor swift");
        dvd4.setLength(200);
        order2.addMedia(dvd4);

        order2.printOrder();
    }
}