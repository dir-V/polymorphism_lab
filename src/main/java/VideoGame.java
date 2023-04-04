import enums.Genre;

public class VideoGame extends MediaItem {

    private String publisher;
    public VideoGame(String title, Genre genre, String publisher, int reviewScore, double price) {
        super(title, genre, reviewScore, price);
        this.publisher = publisher;
    }


}
