public class Cart{
    private int qtyOrdered = 0;
    public static final int  MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public void addDigitalDiscs(DigitalVideoDisc disc){
        if( qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full!");
            return;
        }else{
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added!");
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
}