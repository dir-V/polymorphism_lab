import enums.Genre;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BookTest {

    Book book;

    @BeforeEach
    public void setUp(){
        book = new Book("Babel", Genre.FANTASY, 90, 15.00, "RF.Kuang");
    }


    @Test
    public void canRead(){
        assertThat(book.read(book)).isEqualTo("Babel is a FANTASY book by RF.Kuang");
        System.out.println(book.read(book));
    }

    @Test
    public void canBookmarkPage(){
        assertThat(book.saveProgress(200)).isEqualTo ("Bookmarked page 200");
        assertThat(book.getProgress(book)).isEqualTo("Continue from page 200");
    }

    @Test
    public void canGetBookmarkedPage(){
        assertThat(book.getProgress(book)).isEqualTo("Continue from page 0");
    }



}
