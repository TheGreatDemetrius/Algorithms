public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 0, 2, 4, 6, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
        for (int i : arr)
            System.out.println(i);
    }
}
