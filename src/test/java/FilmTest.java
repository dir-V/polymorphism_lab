import enums.Genre;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmTest {

    Film bladeRunner;
    Film frenchDispatch;

    @BeforeEach
    public void setUp(){
        bladeRunner = new Film("Blade Runner 2049", Genre.SCI_FI, "Denis Villeneuve", 95, 45.00);
        frenchDispatch = new Film("The French Dispatch", Genre.COMEDY, "Wes Anderson", 77, 32.00);
    }

    @Test
    public void canGetReviewScore(){
        System.out.println(bladeRunner.getReviewScore(bladeRunner));
    }

}
