package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart{
    private int qtyOrdered = 0;
    public static final int  MAX_NUMBERS_ORDERED = 20;
    
    private static int nbDigitalVideoDisc = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public void addDigitalDiscs(DigitalVideoDisc disc){
        if( qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full!");
            return;
        }else{
            itemsOrdered[qtyOrdered] = disc;
            nbDigitalVideoDisc++;
            itemsOrdered[qtyOrdered].setID(qtyOrdered + 1); 
            qtyOrdered++;
            System.out.println("The disc has been added!");
        }
        
    }

    public void addDigitalDiscs(DigitalVideoDisc [] dvdList, int size){
        if( qtyOrdered + size > MAX_NUMBERS_ORDERED){
            System.out.println("The cart can not add " + size + "dics");

        }
        else{
            for( int i = 0; i < size; i++ ){
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
                

            }
            System.out.println("The list of " + size + " DVDs have been added successfully!");
        }
    }
    
    public void addDigitalDiscs(DigitalVideoDisc [] dvdList) {
    	int size = dvdList.length;
    	if( qtyOrdered + size > MAX_NUMBERS_ORDERED){
            System.out.println("The cart can not add " + size + "dics");

        }
        else{
            for( int i = 0; i < size; i++ ){
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
                

            }
            System.out.println("The list of " + size + " DVDs have been added successfully!");
        }
    	
    }

    public void addDigitalDiscs(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if( qtyOrdered + 2 > MAX_NUMBERS_ORDERED){
            System.out.println("The cart can not add 2 dics");
        }else{
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2;
            System.out.println("2 DVDs have been added successfully!");
        }
        
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int check = 0; // check xem co tim thay k
        int find = -1; // luu chi so cua cai muon xoa bo
        
        if( qtyOrdered == 0){ // check xem cart empty or not
            System.out.println("The cart is empty!");
            return;
        }

        for(int i = 0; i < qtyOrdered; i++){
            if( itemsOrdered[i] == disc ){
                find = i;
                check = 1;
                break;
            }
        }
        if (check == 1){ // thay doi lai thu tu disc sau khi xoa 1 disc
            for(int i = find; i < qtyOrdered; i++ ){
                itemsOrdered[find] = itemsOrdered[find + 1]; 
            }
            qtyOrdered--;
            System.out.println("The disc has been removed from the cart!");

        }

    }

    public float totalCost(){
        float total = 0;
        for(int i = 0; i < qtyOrdered; i++){
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    public void print() {
    	System.out.println("*************CART*************");
    	System.out.println("Ordered Items:");
    	
    	for(int i = 0; i < nbDigitalVideoDisc; i++ ) {
    		//System.out.println(itemsOrdered[i].getTitle() + itemsOrdered[i].getId());
    		itemsOrdered[i].ToString();
    	}
    	System.out.println("Total cost: " + totalCost() );
    	
    }
    
    public void searchID(int ID) {
    	System.out.println("--------Information of DVD having ID " + ID + "----------");
    	if( ID <= qtyOrdered + 1) {
    		
    		itemsOrdered[ID - 1].ToString();
    		
    	}
    	else System.out.println("Cannot found DVD having ID " + ID );
    }
    
    public void searchTitle(String name) {
    	int check = 0;
    	System.out.println("--------Information of DVD having Title " + name + "----------" );
    	for(int i = 0; i < qtyOrdered; i++) {
    		if(name.equals(itemsOrdered[i].getTitle()) ) {
    			check = 1;
    			
    			itemsOrdered[i].ToString();
    			break;
    		}
    	}
    	if (check == 0) {
    		System.out.println("Cannot found DVD having title " + name );
    	}
    }
}