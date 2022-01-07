public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 0, 2, 4, 6, 8};
        for (int i = 1; i < arr.length; i++)
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                int tmp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = tmp;
            }
        for (int i : arr)
            System.out.println(i);
    }
}
