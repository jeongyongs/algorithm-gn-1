public class Main {

    public static void main(String[] args) {
        String[] inputs = {"10.01", "11.001", "1001.001101", "10100.1101", "10111.101",
                "0.00000001", "0.000000001", "0.0000000001", "0.00000000001"};
        double[] outputs = {2.25, 3.125, 9.203125, 20.8125, 23.625, 0.00390625, 0.001953125,
                0.0009765625, 0.00048828125};

        double score = test(inputs, outputs);

        System.out.printf(" %d 개의 문제 중, %1.0f 개를 맞추었습니다.", inputs.length, score);

    }

    public static double test(String[] inputs, double[] outputs) {
        double score = 0;

        for (int i = 0; i < inputs.length; i++) {

            double correctAnwser = outputs[i];
            double yourAnwser = solution(inputs[i]);
            boolean isCorrected = (correctAnwser == yourAnwser);

            int decimalLength = String.valueOf(correctAnwser).split("\\.")[1].length() + 1;

            System.out.println("**** Case " + (i + 1) + " ****");

            String inputFormat = "Input : %s \t -> Expected : %1." + decimalLength + "f %n";
            System.out.printf(inputFormat, inputs[i], correctAnwser);

            String resultFormat = "Your Answer : %1." + decimalLength + "f is ";
            System.out.printf(resultFormat, yourAnwser);

            if (isCorrected) {
                score++;
                System.out.println("Corrected Anwser");
            } else {
                System.out.println("Wrong Anwser");
            }
        }

        return score;
    }

    private static double solution(String string) {

        return 0;
    }
}
