import java.util.ArrayDeque;

public class BalancedBrackets {
    public static void main(String[] args) {
        String str = "([{}])";
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++)
            if (!stack.isEmpty() &&
                    (str.charAt(i) == ')' && stack.getFirst() == '(' ||
                    str.charAt(i) == ']' && stack.getFirst() == '[' ||
                    str.charAt(i) == '}' && stack.getFirst() == '{'))
                stack.removeFirst();
            else
                stack.addFirst(str.charAt(i));
        System.out.print(stack.isEmpty());
    }
}
