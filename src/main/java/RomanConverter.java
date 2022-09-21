public class RomanConverter {
    public String convertToRoman(int number) {
        String roman = "";
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < numbers.length; i++) {
            while (number >= numbers[i]) {
                roman += romanNumerals[i];
                number -= numbers[i];
            }
        }
        return roman;
    }

}
