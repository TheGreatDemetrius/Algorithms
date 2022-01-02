public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.print(gcd(2, 8));
    }

    static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}
