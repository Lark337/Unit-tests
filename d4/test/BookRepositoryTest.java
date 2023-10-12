
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class BookRepositoryTest {

    @Test
    void getBookTest(){
        BookRepository mockBookRep = mock(BookRepository.class);
        Book book1 = new Book("author1","name1");
        Book book2 = new Book("author2","name2");
        when(mockBookRep.getBook(0)).thenReturn(book1);
        when(mockBookRep.getBook(1)).thenReturn(book2);
        assertThat(mockBookRep.getBook(0)).isEqualTo(book1);
        assertThat(mockBookRep.getBook(1)).isEqualTo(book2);
    }

}
