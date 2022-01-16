public class SieveEratosthenes {
    public static void main(String[] args) {
        int n = 8;
        boolean[] arr = new boolean[++n];
        for (int i = 2; i * i < n; i++)
            if (!arr[i])
                for (int j = i * i; j < n; j += i)
                    arr[j] = true;
        for (int i = 2; i < n; i++)
            if (!arr[i])
                System.out.println(i);
    }
}
