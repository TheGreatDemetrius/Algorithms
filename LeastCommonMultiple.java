public class LeastCommonMultiple{
	public static void main(String[] args) {
		System.out.print(lcm(2, 10));
	}
	static int gcd(int a, int b) {
	    if (a == 0) return b;
	    return gcd(b % a, a);
	}
	static int lcm(int a, int b) {
	    return (a / gcd(a, b)) * b;
	}
}
