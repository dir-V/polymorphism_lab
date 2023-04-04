import enums.Genre;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FilmTest {

    Film bladeRunner;
    Film frenchDispatch;

    @BeforeEach
    public void setUp(){
        bladeRunner = new Film("Blade Runner 2049", Genre.SCI_FI, "Denis Villeneuve", 95, 45.00);
        frenchDispatch = new Film("The French Dispatch", Genre.COMEDY, "Wes Anderson", 77, 32.00);
    }

    @Test
    public void canPlay(){
        assertThat(bladeRunner.play()).isEqualTo("Now playing Blade Runner 2049");
    }

    @Test
    public void canSaveProgress(){
        assertThat(bladeRunner.saveProgress(60)).isEqualTo("Blade Runner 2049 will continue from 60 minutes in next time it is played");
        assertThat(bladeRunner.getProgress(bladeRunner)).isEqualTo("Resuming Blade Runner 2049 from 60 minutes in.");
    }

    @Test
    public void filmStartsFromBeginning(){
        assertThat(bladeRunner.getProgress(bladeRunner)).isEqualTo("Resuming Blade Runner 2049 from 0 minutes in.");
    }



}
