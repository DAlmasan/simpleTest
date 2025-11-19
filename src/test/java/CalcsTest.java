import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcsTest {

    @Test
    public void alwaysFail() {
        assertEquals(2, 1); // swapped order to follow assertEquals(expected, actual)
    }

    @Test
    public void alwaysFail1() {
        assertEquals(2, 1);
    }

    @Test
    public void alwaysFail2() {
        assertEquals(2, 1);
    }

    @Test
    public void ESInProgress() {
        assertEquals(3, 1);
    }

    @Test
    public void testestestestest() {
        assertEquals(1, 1);
    }

    @Test
    public void sum_test_A() {
        assertEquals(3, VerifyDefect.sum(1, 2));
    }
}
