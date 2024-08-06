import com.app.ReverseString;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class JUnit4 {

    @Test
    void test() {

        ReverseString reverseString = new ReverseString();

        assertEquals(reverseString.reverse("Hello world!"), "!dlrow olleH");
    }

    @Test
    void testReverseString_MultipleWords() {

        ReverseString reverseString = new ReverseString();

        assertEquals(reverseString.reverse("Hello world! How are you?"), "?uoy era woH !dlrow olleH");
    }
}
