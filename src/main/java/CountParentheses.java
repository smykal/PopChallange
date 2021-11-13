import java.util.stream.IntStream;

public class CountParentheses implements Functions {
    @Override
    public boolean countParentheses(String inputString) {
        boolean result = false;
        int openParentheses = 0;
        int closeParentheses = 0;
        char[] chars = inputString.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                openParentheses = openParentheses + 1;
            } else if (chars[i] == ')') {
                closeParentheses = closeParentheses + 1;
            }
        }

        if (openParentheses == closeParentheses) {
            result = true;
        }

        System.out.println("string to check: " + inputString);
        System.out.println("open parentheses: " + openParentheses);
        System.out.println("close parentheses: " + closeParentheses);
        System.out.println(
                new StringBuilder()
                        .append("result: ")
                        .append(result).toString());

        return result;
    }
}
