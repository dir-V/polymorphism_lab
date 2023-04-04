import enums.Genre;

public abstract class MediaItem {

    protected Genre genre;
    protected int reviewScore;
    protected String title;
    protected double price;
    protected int progress;


    public MediaItem(String title, Genre genre, int reviewScore, double price){
        this.title = title;
        this.genre = genre;
        this.reviewScore = reviewScore;
        this.price = price;
        this.progress = 0;
    }

    public int getReviewScore(MediaItem mediaItem){
        return this.reviewScore;
    }

    public abstract String saveProgress(int progress);
    public abstract String getProgress(MediaItem media);

    public String getTitle() {
        return this.title;
    }

}
