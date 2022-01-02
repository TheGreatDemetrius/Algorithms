public class LeastCommonMultiple{
    public static void main(String[] args) {
        System.out.print(lcm(2, 8));
    }

    static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
