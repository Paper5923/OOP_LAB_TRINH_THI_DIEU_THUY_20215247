public class Aims{
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87,  19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);    
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalDiscs(dvd3);
        anOrder.addDigitalDiscs(dvd2);
        anOrder.addDigitalDiscs(dvd1);
        anOrder.removeDigitalVideoDisc(dvd3);
        System.out.println("Total cost is: "+ anOrder.totalCost());
    }
    
} 