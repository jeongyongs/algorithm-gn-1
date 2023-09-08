public class Main {

    private static double correctCount = 0;
    private static final String[][] TESTCASES =
            new String[][] {{"123", "123", "246"}, {"1000", "1", "2"}, {"456", "789", "1461"},
                    {"5", "5", "1"}, {"11112", "54321", "65433"}, {"3829", "1300", "4139"}};

    public static void main(String[] args) {
        for (int i = 0; i < TESTCASES.length; i++)
            System.out.println("Testcase " + i + " = "
                    + test(TESTCASES[i][0], TESTCASES[i][1], TESTCASES[i][2]));

        System.out.println("정답률 = " + (int) (correctCount / TESTCASES.length * 100) + "%");
    }

    private static boolean test(String input, String input2, String answer) {
        int first = Integer.parseInt(input);
        int second = Integer.parseInt(input2);

        boolean res = String.valueOf(solution(first, second)).equals(answer);
        if (res)
            correctCount++;
        return res;
    }

    private static int solution(int first, int second) {
        return flipNumberBySplit(flipNumberBySplit(first) + flipNumberBySplit(second));
    }

    private static int flipNumberBySplit(int input) {
        String result = "";
        String inputString = String.valueOf(input);
        String[] splittedString = inputString.split("");

        for (int i = 0; i < splittedString.length; i++) {
            result += splittedString[splittedString.length - i - 1];
            // 마지막 인덱스부터 불러오는 대신 앞에서부터 스택에 담는다면?
            // 스택에 담는 과정과 꺼내는 과정, 총 두 번의 루프를 돌겠네.
            // 지금 방식보다 더 나은 점이 있나?
        }

        return Integer.parseInt(result);
    }

    private static int flipNumberByDivide(int input) {
        String result = "";
        int last = input;

        while (last > 9) {
            int digit = last % 10;
            last /= 10;
            result += digit;
        }
        result += last;

        return Integer.parseInt(result);
    }
}
