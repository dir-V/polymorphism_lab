public class VideoGame extends MediaItem {

    public VideoGame(String title, Genre genre, int reviewScore, double price) {
        super(title, genre, reviewScore, price);
        this.publisher = publisher;
    }
}
