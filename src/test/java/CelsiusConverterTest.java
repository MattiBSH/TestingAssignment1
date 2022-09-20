import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelsiusConverterTest {

    @Test
    public void convertToFahreheit() {
        CelsiusConverter celsiusConverter = new CelsiusConverter();

        assertEquals(celsiusConverter.getFahreheit(42), 107.6, 0.01);
    }

}