public class GreatestCommonDivisor {
	public static void main(String[] args) {
		System.out.print(gcd(2, 10));
	}
	static int gcd(int a, int b) {
	    if (a == 0) return b;
	    return gcd(b % a, a);
    }
}
