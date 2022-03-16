public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(isValid("([{}])"));
    }

    static boolean isValid(String str) {
        int length = str.length();
        str = str.replaceAll("\\(\\)|\\[]|\\{}", "");
        return str.length() != length && (str.length() == 0 || isValid(str));
    }
}
