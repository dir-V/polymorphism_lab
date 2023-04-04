import enums.Genre;
import enums.Platform;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VideoGameTest {

    VideoGame videoGame;


    @BeforeEach
    public void setUp(){
        videoGame = new VideoGame("Jak and Daxter",Genre.ADVENTURE, "Naughty Dog",Platform.PLAYSTATION_2,99, 16.00);
    }

    @Test
    public void canPlay(){
        assertThat(videoGame.play()).isEqualTo("Now playing Jak and Daxter");
    }

    @Test
    public void canSaveGame(){
        assertThat(videoGame.saveProgress(20)).isEqualTo("Progress Saved. 20%");
        assertThat(videoGame.getProgress(videoGame)).isEqualTo("Resuming from 20% SAVE GAME.");
    }

    @Test
    public void saveGameEquals0(){
        assertThat(videoGame.getProgress(videoGame)).isEqualTo("Resuming from 0% SAVE GAME.");
    }


}
