package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	public static final int  max_dvd = 20;
	private DigitalVideoDisc dvd[] = new DigitalVideoDisc[max_dvd];
	
	private int nb_dvd = 0;
	
	public void addDVD(DigitalVideoDisc disc) {
		
		if( nb_dvd + 1 <= max_dvd ) {
			dvd[nb_dvd] = disc;
			dvd[nb_dvd].setID(nb_dvd + 1);
			nb_dvd++;
			 
			System.out.println("The disc has been added!");
			
		}
		else {
			System.out.println("The cart is full!");
			
		}
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		int check = -1;
		
		for(int i = 0; i < nb_dvd; i++) {
			if( dvd[i] == disc) {
				check = i;
				System.out.println("The dis has been removed");
				break;
			}
		}
    	if( check == -1 ) System.out.println("Cannot remove the disc!");
			else {
				for(int i = check ; i <nb_dvd - 1; i++) dvd[i] = dvd[i+1];
				nb_dvd--;
			}
	}
	
	public void printList() {
		System.out.println("*************STORE*************");
    	System.out.println("Ordered Items:");
    	
    	for(int i = 0; i < nb_dvd; i++)  dvd[i].ToString();
    	}
	}
	

