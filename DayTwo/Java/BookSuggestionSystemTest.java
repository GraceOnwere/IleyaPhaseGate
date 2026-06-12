import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookSuggestionSystemTest{


    @Test
    public void testThatICanAddBookIntoTheBookLibrary(){

    ArrayList<String> bookLibrary = new ArrayList<>();

    String newBook = "Grace";

    ArrayList<String> actual = BookSuggestionSystem.addBook(bookLibrary,newBook);

    bookLibrary.add(newBook);

    assertIterableEquals(actual,bookLibrary);
   
    }

    @Test
    public void testThatABookAlreadyExistsAndReturnTheInitalArrayList(){

    ArrayList<String> bookLibrary = new ArrayList<>();

    String newBook = "Grace";

    bookLibrary.add(newBook);

    ArrayList<String> actual = BookSuggestionSystem.addBook(bookLibrary,newBook);

    assertIterableEquals(actual,bookLibrary);

    }


}
