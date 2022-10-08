public class PrimalityTest {
    public static void main(String[] args) {
        System.out.print(isPrime(8));
    }

    static boolean isPrime(int n) {
	    if (n <= 1)
		    return false;
	    for (int i = 2; i < n; i++)
		    if (n % i == 0)
			    return false;
	    return true;
    }
}
