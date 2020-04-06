public class DiskTest {
    public static void main(String[] args) {
        Order order1 = new Order();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Harry potter");
        dvd1.setCategory("cate1");
        dvd1.setCost(100);
        dvd1.setDirector("dir1");
        dvd1.setLength(10);
        order1.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("potter like harry");
        dvd2.setCategory("cate2");
        dvd2.setCost(200);
        dvd2.setDirector("dir2");
        dvd2.setLength(20);
        order1.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("potter and potter");
        dvd3.setCategory("cate3");
        dvd3.setCost(300);
        dvd3.setDirector("dir3");
        dvd3.setLength(30);
        order1.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("potter dvd ");
        dvd4.setCategory("cate4");
        dvd4.setCost(400);
        dvd4.setDirector("dir4");
        dvd4.setLength(40);
        order1.addDigitalVideoDisc(dvd4);

        order1.setDate(new MyDate(1, 2, 1999));
        order1.printOrder();
        for (int i = 0; i < order1.numberOfItem(); i++) {
            System.out.println(order1.getItem(i).search("Harry potter"));
        }
    }
}