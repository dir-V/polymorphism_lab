import enums.Genre;
import enums.Platform;
import interfaces.IPlay;

public class VideoGame extends MediaItem implements IPlay {

    private String publisher;
    private Platform platform;
    public VideoGame(String title, Genre genre, String publisher, Platform platform, int reviewScore, double price) {
        super(title, genre, reviewScore, price);
        this.publisher = publisher;
        this.platform = platform;
    }

    public String play(){
        return "Now playing " + this.title;
    }

    public String saveProgress(int save){
        this.progress = save;
        return "Progress Saved. " + save + "%";
    }

    public String getProgress(MediaItem media){
        return "Resuming from " +  this.progress + "% SAVE GAME.";
    }

    public String getTitle() {
        return this.title;
    }
}
