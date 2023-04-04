import enums.Genre;

public class Book extends MediaItem{

    private String author;
    private int page;

    public Book(String title, Genre genre, int reviewScore, double price, String author) {
        super(title, genre, reviewScore, price);
        this.author = author;

    }

    public String read(Book book){
        return this.title + " is a " + genre + " book by " + this.author;
    }

    public String saveProgress(int page){
        this.page = page;
        return "Bookmarked page " + page;
    }

    public String getProgress(MediaItem media){
        return "Continue from page " +  this.page;
    }
}
