public class IgnoreDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int n = arr.length - 1;
        for (int i = 0; i < n; i++)
            if (arr[i] != arr[i + 1])
                System.out.println(arr[i]);
        System.out.println(arr[n]);
    }
}
