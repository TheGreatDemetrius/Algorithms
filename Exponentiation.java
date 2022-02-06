public class Exponentiation {
    public static void main(String[] args) {
        System.out.print(pow(2, 8));
    }

    static int pow(int a, int b) {
        return b == 0 ? 1 : a * pow(a, b - 1);
    }
}
