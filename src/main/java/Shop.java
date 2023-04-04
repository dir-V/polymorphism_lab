
import interfaces.IPlay;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<MediaItem> stock;
    private double till;
    private ArrayList<IPlay> digitalMedia;


    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = 0;
        this.digitalMedia = new ArrayList<>();
    }

    public ArrayList<MediaItem> getStock(){
        return stock;
    }
    public void addStock(MediaItem mediaItem){
        this.stock.add(mediaItem);
    }
    public int stockCount(){
        return this.stock.size();
    }
    public double getTill(){
        return till;
    }
    public void setTill(double till){
         this. till = till;
    }

    public void addDigitalMedia(IPlay digitalMedia){
        this.digitalMedia.add(digitalMedia);
    }
    public ArrayList<IPlay> getDigitalMedia() {
        return this.digitalMedia;
    }
}


