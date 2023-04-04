import enums.Genre;
import interfaces.IPlay;

public class VideoGame extends MediaItem implements IPlay {

    private String publisher;
    public VideoGame(String title, Genre genre, String publisher, int reviewScore, double price) {
        super(title, genre, reviewScore, price);
        this.publisher = publisher;
    }

    public String play(){
        return "Now playing " + this.title;
    }
}
