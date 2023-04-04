import enums.Genre;
import enums.Platform;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MediaItemTest {
    MediaItem book1;
    MediaItem book2;
    MediaItem film;
    MediaItem videoGame;

    @BeforeEach
    public void setUp(){
        book1 = new Book("Babel", Genre.FANTASY, 90, 15.00, "RF.Kuang");
        book2 = new Book ("Hell Bent", Genre.FANTASY, 80, 20.00, "Leigh Bardugo");
        film = new Film("Blade Runner 2049", Genre.SCI_FI, "Denis Villeneuve", 95, 45.00);
        videoGame = new VideoGame("Jak and Daxter", Genre.ADVENTURE, "Naughty Dog", Platform.PLAYSTATION_2,99, 16.00);
    }

    @Test
    public void canGetReviewScore(){
        assertThat(book1.getReviewScore(book1)).isEqualTo(book1.reviewScore);
        assertThat(book2.getReviewScore(book2)).isEqualTo(book2.reviewScore);
        assertThat(film.getReviewScore(film)).isEqualTo(film.reviewScore);
        assertThat(videoGame.getReviewScore(videoGame)).isEqualTo(videoGame.reviewScore);
    }



}


