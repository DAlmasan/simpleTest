import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppleTest {

    @Test
    void alwaysFailAp() {
        assertEquals(1, 1);
    }

    @Test
    void alwaysFailAp1() {
        assertEquals(1, 2);
    }

    @Test
    void alwaysFailAp3() {
        assertEquals(1, 1);
    }

    @Test
    void alwaysFailAp4() {
        assertEquals(1, 5);
    }
}
