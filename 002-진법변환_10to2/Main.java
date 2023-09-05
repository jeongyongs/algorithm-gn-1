public class Main {

    public static void main(String[] args) {
        int[] input = {0, 3, 2, 624, 339, 13, 45232};
        String[] output = {"0", "11", "10", "1001110000", "101010011", "1101", "1011000010110000"};

        System.out.printf("Out of %d Cases, %1.0f were correct", input.length, test(input, output));
    }

    public static double test(int[] input, String[] output) {
        double score = 0;

        for (int i = 0; i < input.length; i++) {
            System.out.printf("Case %d %n", i);

            String correct = output[i];
            System.out.printf("Input : %d \t -> Expected : %s %n", input[i], output[i]);

            String str = solution(input[i]);
            System.out.printf("Your Answer : %s %n", str);

            if (str.equals(correct)) {
                score++;
            }
        }

        return score;
    }

    public static String solution(int input) {
        String result = "";
        int current = input;

        if (current < 2) {
            return "0";
        }

        while (current >= 2) {
            result = (current % 2) + result;
            current /= 2;
        }
        result = current + result;

        return result;
    }

}
