import enums.Format;
import enums.Genre;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MusicTest {

    Music music;

    @BeforeEach
    public void setUp(){
        music = new Music ("Tha Carter V", "Lil Wayne", Genre.HIPHOP, Format.CD, 75, 13.00 );
        music = new Music("Superclean, Vol. I", "The Marias", Genre.INDIE, Format.VINYL, 80, 25);
        music = new Music ("Speakerboxxx/The Love Below", "Outkast", Genre.RnB, Format.CASSETTE, 90, 16.00 );
    }

    @Test
    public void canPlay(){
         System.out.println(music.play());
    }



}
