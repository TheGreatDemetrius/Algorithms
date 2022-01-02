public class Factorial {
    public static void main(String[] args) {
        System.out.print(fac(8));
    }

    static int fac(int n) {
        return n == 0 ? 1 : n * fac(n - 1);
    }
}
