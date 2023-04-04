import enums.Format;
import enums.Genre;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MusicTest {

    Music music1;
    Music music2;
    Music music3;

    @BeforeEach
    public void setUp(){
        music1 = new Music ("Tha Carter V", "Lil Wayne", Genre.HIPHOP, Format.CD, 75, 13.00 );
        music2 = new Music("Superclean, Vol. I", "The Marias", Genre.INDIE, Format.VINYL, 80, 25);
        music3 = new Music ("Speakerboxxx/The Love Below", "Outkast", Genre.RnB, Format.CASSETTE, 90, 16.00 );
    }

    @Test
    public void canPlay(){
        assertThat(music1.play()).isEqualTo("Now playing Tha Carter V by Lil Wayne");
        assertThat(music2.play()).isEqualTo("Now playing Superclean, Vol. I by The Marias");
        assertThat(music3.play()).isEqualTo("Now playing Speakerboxxx/The Love Below by Outkast");
         System.out.println(music1.play());
    }

    @Test
    public void canPauseTrack(){
        assertThat(music1.saveProgress(2)).isEqualTo("Track paused at 2 minutes in.");
        assertThat(music1.getProgress(music1)).isEqualTo("Resuming Tha Carter V from 2 minutes.");
    }

    @Test
    public void trackStartFromBeginning(){
        assertThat(music1.getProgress(music1)).isEqualTo("Resuming Tha Carter V from 0 minutes.");
    }





}
