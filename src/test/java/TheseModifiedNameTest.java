import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheseModifiedNameTest {

    private int a = 1;
    private int b = 1;

    @Test
    void alwaysPass1() {
        assertEquals(a, 1);
        assertEquals(1, 2);
    }

    @Test
    void alwaysPass1New() {
        assertEquals(1, 5);
    }

    @Test
    void alwaysPass1New1() {
        assertEquals(1, 2);
    }

    @Test
    void alwaysPass1New12() {
        assertEquals(1, 1);
    }

    @Test
    void alwaysPass2() {
        assertEquals(1, 2);
        System.out.println("proba9");
    }

    @Test
    void alwaysPass3() {
        assertEquals(1, 1);
    }

    @Test
    void alwaysPassD() {
        assertEquals(1, 1);
    }

    @Test
    void alwaysPass4() {
        assertEquals(1, 1);
    }

    @Test
    void alwaysPassA() {
        assertEquals(1, 1);
    }

    @Test
    void alwaysPassB() {
        assertEquals(1, 2);
    }

    @Test
    void alwaysPassG() {
        assertEquals(1, 1);
        System.out.println("proba7");
    }

    @Test
    void alwaysPassH() {
        assertEquals(1, 2);
        System.out.println("proba8kodojoso");
    }

    @Test
    void alwaysPassF() {
        assertEquals(1, 2);
    }

    @Test
    void alwaysFail5() {
        assertEquals(1, 1);
    }

    @Test
    void alwaysPass6() {
        assertEquals(1, 2);
    }

    @Test
    void alwaysPassC() {
        assertEquals(1, 5);
    }

    @Test
    void alwaysPass7() {
        assertEquals(1, 1);
    }

    @Test
    void alwaysFail81() {
        assertEquals(1, 1);
    }

    @Test
    void alwaysFail91() {
        assertEquals(1, 1);
    }

    @Test
    void alwaysFail10() {
        assertEquals(1, 1);
        System.out.println("Neata!");
    }

    @Test
    void alwaysFail11() {
        assertEquals(1, 1);
    }

    @Test
    void alwaysFail12() {
        assertEquals(1, 1);
    }

    @Test
    void alwaysFail13() {
        assertEquals(1, 1);
    }

    @Test
    void alwaysFailE() {
        assertEquals(1, 1);
        System.out.println("Neata2!");
    }

    @Disabled
    @Test
    void ignored1() {
        Random random = new Random();
        int randomNumber = random.nextInt(99);
        boolean smallerThanFiftee = randomNumber < 50;
        assertEquals(true, smallerThanFiftee);
    }

    @Disabled
    @Test
    void ignored2() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee = randomNumber < 50;
        assertEquals(true, smallerThanFiftee);
    }

    @Disabled
    @Test
    void sometimesPass888200() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee = randomNumber < 50;
        assertEquals(true, smallerThanFiftee);
    }

    @Disabled
    @Test
    void sometimesPass888198() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee = randomNumber < 50;
        assertEquals(true, smallerThanFiftee);
    }
}
