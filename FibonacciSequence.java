public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.print(fib(8));
    }

    static int fib(int n) {
        return n < 2 ? n : fib(n - 1) + fib(n - 2);
    }
}
