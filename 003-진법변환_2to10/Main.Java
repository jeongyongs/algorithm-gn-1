public class Main {

    private static final String[] TEST_CASE_KEYS = {
            "00000001",
            "101",
            "1011",
            "111000",
            "1011111",
            "1111111111111",
            "00111001110001111100001"
    };

    private static final int[] TEST_CASE_VALUES = {
            1,
            5,
            11,
            56,
            95,
            8191,
            1893345
    };

    private static double correct = 0;

    public static void main(String[] args) {
        for (int i = 0; i < TEST_CASE_KEYS.length; i++) {
            System.out.println("Test Case " + (i + 1) + " = " + test(TEST_CASE_KEYS[i], TEST_CASE_VALUES[i]));
        }

        System.out.printf("정답률 = %.3f%%", (correct / TEST_CASE_KEYS.length * 100));
    }

    private static boolean test(String input, Integer result) {
        if (solution(input) == result) {
            correct++;
            return true;
        }

        return false;
    }
}