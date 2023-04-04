public abstract class MediaItem {

    protected Genre genre;
    protected int reviewScore;
    protected String title;
    protected double price;


    public MediaItem(String title, Genre genre, int reviewScore, double price){
        this.title = title;
        this.genre = genre;
        this.reviewScore = reviewScore;
        this.price = price;
    }

    public int getReviewScore(){
        return this.reviewScore;
    }



}
