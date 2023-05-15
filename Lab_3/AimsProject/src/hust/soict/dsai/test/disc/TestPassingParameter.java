package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String []args){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        
        swap2(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle() );
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle() );

//        changeTitile(jungleDVD, cinderellaDVD.getTitle());
//        System.out.println("jungle dvd title: " + jungleDVD.getTitle());s

    }

    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void swap2(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        String tmp = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(tmp);
    }

    public static void changeTitile(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);

    }
    
}
