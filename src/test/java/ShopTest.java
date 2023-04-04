import enums.Format;
import enums.Genre;
import enums.Platform;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShopTest {

    Shop shop;
    Book book1;
    Book book2;
    VideoGame videoGame;
    Film film;
    Music music;


    @BeforeEach
    public void setUp(){
        shop = new Shop("V's MultiMedia");
        book1 = new Book("Babel", Genre.FANTASY, 90, 15.00, "RF.Kuang");
        book2 = new Book ("Hell Bent", Genre.FANTASY, 80, 20.00, "Leigh Bardugo");
        film = new Film("Blade Runner 2049", Genre.SCI_FI, "Denis Villeneuve", 95, 45.00);
        videoGame = new VideoGame("Jak and Daxter", Genre.ADVENTURE, "Naughty Dog", Platform.PLAYSTATION_2,99, 16.00);
        music = new Music("Superclean, Vol. I", "The Marias", Genre.INDIE, Format.VINYL, 81, 25);

    }

    @Test
    public void canAddToStock(){
        shop.addStock(book1);
        shop.addStock(book2);
        shop.addStock(film);
        shop.addStock(videoGame);
        shop.addStock(music);
        System.out.println(shop.getStock());
        assertThat(shop.stockCount()).isEqualTo(5);
    }

    @Test
    public void canOnlyDigitalMedia(){
        shop.addDigitalMedia(film);
        shop.addDigitalMedia(videoGame);
        shop.addDigitalMedia(music);
        System.out.println(shop.getDigitalMedia());
    }




}
