package codeclan.com.librarylab;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 08/11/2017.
 */

public class BookTest {

    Book book1;

    @Before
    public void before(){
        book1 = new Book("For Whom the Bell Tolls");
    }

    @Test
    public void testCanGetName() {
    assertEquals("For Whom the Bell Tolls", book1.getTitle());
    }

}
