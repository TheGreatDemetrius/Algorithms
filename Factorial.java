public class Factorial {
    public static void main(String args[]) {
        System.out.print(fac(8));
    }
    static int fac(int n) {
        if(n == 0) return 1;
        return n * fac(n - 1);
    }
}
