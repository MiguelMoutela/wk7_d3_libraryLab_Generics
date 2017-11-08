package codeclan.com.librarylab;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 08/11/2017.
 */

public class LIbraryTest {

    Library bookLibrary;
    Book book1;

    @Before
    public void before() {
    bookLibrary = new Library<Book>();
    book1 = new Book("Boo");
    }

    @Test
    public void libraryCanAddBook() {
        bookLibrary.addToLibrary(book1);
        assertEquals(1, bookLibrary.getSize());
    }

    @Test
    public void testLendItem() {
        bookLibrary.addToLibrary(book1);
        bookLibrary.lendItem(book1);
        assertEquals(0, bookLibrary.getSize());
//        assertEquals(false, bookLibrary.include?(book1));
    }
    @Test
    public void returnItem() {
        bookLibrary.addToLibrary(book1);
        bookLibrary.lendItem(book1);

    }
}
