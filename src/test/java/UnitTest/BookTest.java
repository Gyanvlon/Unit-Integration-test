package UnitTest;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookTest {
    private Book book1;
    @Before
    public void setup(){
        book1 =new Book(1L, "java", "vlon", 110);
//        book1 = mock(Book.class);
    }
    @Test
    public void equalBook(){
        assertEquals("java",book1.getTitle());
    }
    @Test
    public void notEqualBook(){
        assertNotEquals("javas",book1.getTitle());
    }
    @Test(expected = RuntimeException.class)
    public void checkPrice(){
        book1.validateValue(0);
    }

//    @Test
//    public void bookAvailable(){
//        List<String> books = Arrays.asList("angular");
//        when(book1.getBookList()).thenReturn(books);
//        System.out.println(books);
////        assertTrue();
//    }
}
