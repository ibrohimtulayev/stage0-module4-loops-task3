package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        // Convert the number to a string
        String numberString = String.valueOf(number);

        // Get the length of the string (number of digits)
        int length = numberString.length();

        // Initialize the sum variable to hold the sum of digits
        int sum = 0;

        // Iterate through each digit in the string
        for (int i = 0; i < length; i++) {
            // Get the digit character at index i
            char digitChar = numberString.charAt(i);

            // Convert the digit character to an integer
            int digit = Character.getNumericValue(digitChar);

            // Add the digit to the sum
            sum += digit;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        DigitsSum digitsSumCalculator = new DigitsSum();
        int number = 12345;
        digitsSumCalculator.printDigitsSum(number);
    }
}

