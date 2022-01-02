public class CaesarCipher {
    public static void main(String[] args) {
        String str = "Caesar cipher";
        for (int i = 0; i < str.length(); i++)
            System.out.print((char) (str.charAt(i) + 3));
    }
}
