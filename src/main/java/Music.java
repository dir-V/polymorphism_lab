import enums.Genre;
import enums.Format;
import interfaces.IPlay;

public class Music extends MediaItem implements IPlay {

    private Format format;
    private String artist;

    public Music(String title, String artist,Genre genre, Format format, int reviewScore, double price) {
        super(title, genre, reviewScore, price);
        this.format = format;
        this.artist = artist;
    }

    public String play(){
        return "Now playing " + this.title;
    }
}
