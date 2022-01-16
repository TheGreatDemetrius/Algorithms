public class StringSearching {
    public static void main(String[] args) {
        String text = "abababab", pattern = "abab";
        for (int i = 0; i < text.length(); i++) {
            int j = 0;
            while (j < pattern.length() && i + j < text.length() && text.charAt(i + j) == pattern.charAt(j))
                j++;
            if (j == pattern.length())
                System.out.println(i);
        }
    }
}
