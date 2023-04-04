import enums.Genre;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTest {

    Book book;

    @BeforeEach
    public void setUp(){
        book = new Book("Babel", Genre.FANTASY, 90, 15.00, "RF.Kuang");
    }


    @Test
    public void canRead(){
        System.out.println(book.read(book));
    }



}
