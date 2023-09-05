public class Main {

    public static void main(String[] args) {
        double[] input = {0.90625, 19.6875};
        String[] output = {"0.11101", "10011.1011"};

        System.out.printf("Out of %d Cases, %1.0f were correct", input.length, test(input, output));
    }

    public static double test(double[] input, String[] output) {
        double score = 0;

        for (int i = 0; i < input.length; i++) {
            System.out.printf("Case %d %n", i);

            String correct = output[i];
            System.out.printf("Input : %f \t -> Expected : %s %n", input[i], output[i]);

            String str = solution(input[i]);
            System.out.printf("Your Answer : %s %n", str);

            if (str.equals(correct)) {
                score++;
            }
        }

        return score;
    }

    public static String solution(double input) {
        int integerArea = (int) input;
        double floatArea = input - integerArea;

        return convertInteger(integerArea) + "." + convertFloat(floatArea);
    }

    public static String convertInteger(int input) {
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

    public static String convertFloat(double input) {
        String result = "";
        double current = input;

        while (current > 0) {
            current *= 2;
            result += (int) current;
            current -= (int) current;
        }

        return result;
    }
}
