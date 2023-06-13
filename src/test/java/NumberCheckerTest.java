import static org.junit.Assert.*;
import org.junit.Test;

public class NumberCheckerTest {

    @Test
    public void testCalculateSquare() {
        NumberChecker tChecker = new NumberChecker();
        int square = tChecker.calculateSquare(5);
        assertEquals(25, square);
    }
}
