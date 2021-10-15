public class ExponentiationSquaring {
    public static void main(String[] args) {
        System.out.print(exponentiation(2, 10));
    }
    static long exponentiation(long base, long power) {
        long MOD = 1000000007L, result = 1L;
        while (power > 0) {
            if (power % 2 == 1)
                result = (result * base) % MOD;
            base = (base * base) % MOD;
            power /= 2;
        }
        return result;
    }
}
