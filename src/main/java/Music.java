import enums.Genre;

public class Music extends MediaItem{

    Private Format format;
    Private String artist;

    public Music(String title, Genre genre, int reviewScore, double price) {
        super(title, genre, reviewScore, price);

    }
}
