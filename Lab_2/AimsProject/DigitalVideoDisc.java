import java.lang.constant.DynamicConstantDesc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
   

    public String getTitle(){
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector(){
        return director;
    }
    public int getLength(){
        return length;
    }
    public float getCost(){
        return cost;
    }

    public DigitalVideoDisc( String title){
        super();
        this.title = title;
    }

    public DigitalVideoDisc( String category, String title, float cost){
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public DigitalVideoDisc( String director, String category, String title, float cost){
        super();
        this.title = title;
        this.director = director;
        this.cost = cost;
        this.category = category;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super();
        this.title = title;
        this.director = director;
        this.cost = cost;
        this.category = category;
        this.length = length;
    }
    




}
