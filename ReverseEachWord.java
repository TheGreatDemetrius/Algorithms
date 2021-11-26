public class ReverseEachWord {
    public static void main(String args[]) {
         String words[] = "Reverse string".split("\\s");
         for(String word : words)
            System.out.print(new StringBuilder(word).reverse() + " ");
     }
}
