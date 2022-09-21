import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {

        @Test
        public void convertToRoman() {
            RomanConverter romanConverter = new RomanConverter();

            assertEquals(romanConverter.convertToRoman(1), "I");
            assertEquals(romanConverter.convertToRoman(2), "II");
            assertEquals(romanConverter.convertToRoman(5), "V");
            assertEquals(romanConverter.convertToRoman(10), "X");
            assertEquals(romanConverter.convertToRoman(17), "XVII");
            assertEquals(romanConverter.convertToRoman(20), "XX");
            assertEquals(romanConverter.convertToRoman(21), "XXI");
            assertEquals(romanConverter.convertToRoman(32), "XXXII");
            assertEquals(romanConverter.convertToRoman(42), "XLII");
        }
}
