import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmTest {

    Film film;

    @BeforeEach
    public void setUp(){
        film = new Film("Blade Runner 2049", Genre.SCI_FI, "Denis Villeneuve", 95, 45.00);
        film = new Film("The French Dispatch", Genre.COMEDY, "Wes Anderson", 77, 32.00);
    }

    @Test
    public void canGetRating(){
        System.out.println(film.getReviewScore());
    }

}
