import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void addTest() {
        Main calc = new Main();
        int result = calc.add(1, 2);
        assertEquals(3, result);
    }
}