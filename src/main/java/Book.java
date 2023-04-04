import enums.Genre;

public class Book extends MediaItem{

    private String author;

    public Book(String title, Genre genre, int reviewScore, double price, String author) {
        super(title, genre, reviewScore, price);
        this.author = author;
    }

    public String read(){
        return this.title + " is a " + genre + " book by " + this.author;
    }
}
