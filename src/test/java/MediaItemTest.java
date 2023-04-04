import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaItemTest {
    MediaItem media;

    @BeforeEach
    public void setUp(){
        media = new Book("Babel", Genre.FANTASY, 90, 15.00, "RF.Kuang");
        media = new Book ("Hell Bent", Genre.FANTASY, 80, 20.00, "Leigh Bardugo");
    }

    @Test
    public void canGetRating(){
        System.out.println(media.getReviewScore());
    }

}


