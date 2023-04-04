public class Film extends MediaItem {

    private String director;


    public Film(String title, Genre genre, String director, int reviewScore, double price) {
        super(title, genre, reviewScore, price);
        this.director = director;
    }

    public String getDirector(){
        return director;
    }


}
