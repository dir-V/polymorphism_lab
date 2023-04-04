
import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<MediaItem> stock;
    private double till;


    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = 0;
    }

    public ArrayList<MediaItem> getStock(){
        return stock;
    }
    public void addStock(ArrayList<MediaItem> mediaItems){
        this.stock = mediaItems;
    }
    public double getTill(){
        return till;
    }
    public void setTill(double till){
         this. till = till;
    }

}


