import enums.Genre;
import interfaces.IPlay;

public class Film extends MediaItem implements IPlay {

    private String director;


    public Film(String title, Genre genre, String director, int reviewScore, double price) {
        super(title, genre, reviewScore, price);
        this.director = director;
    }

    public String getDirector(){
        return director;
    }

    public String play(){
        return "Now playing " + this.title;
    }

    public String saveProgress(int progress){
        this.progress = progress;
        return this.title + " will continue from " + progress + " minutes in next time it is played";
    }

    public String getProgress(MediaItem media){
        return "Resuming " + this.title + " from " + this.progress + " minutes in.";
    }

    public String getTitle(){
        return this.title;
    }
}
