public class ReverseWords {
    public static void main(String args[]) {
        String words[] = "Reverse string".split("\\s");
        for (int i = words.length - 1; i >= 0 ; i--)
            System.out.print(words[i] + " ");
    }
}
