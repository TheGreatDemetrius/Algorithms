public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 0, 2, 4, 6, 8};
        int min = arr[0], max = arr[0];
        for (int i : arr)
            if (i < min)
                min = i;
            else if (i > max)
                max = i;
        int[] count = new int[max - min + 1];
        for (int i : arr)
            count[i - min]++;
        for (int idx = 0, i = 0; i < count.length; i++)
            for (int j = 0; j < count[i]; j++)
                arr[idx++] = i + min;
        for (int i : arr)
            System.out.println(i);
    }
}
