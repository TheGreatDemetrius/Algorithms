public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 0, 2, 4, 6, 8};
        sort(arr, arr.length);
        for (int i : arr)
            System.out.println(i);
    }

    static void sort(int[] arr, int n) {
        if (n < 2) return;
        int mid = n / 2;
        int[] l = new int[mid], r = new int[n - mid];
        for (int i = 0; i < mid; i++)
            l[i] = arr[i];
        for (int i = mid; i < n; i++)
            r[i - mid] = arr[i];
        sort(l, mid);
        sort(r, n - mid);
        merge(arr, l, r, mid, n - mid);
    }

    static void merge(int[] arr, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right)
            if (l[i] <= r[j])
                arr[k++] = l[i++];
            else
                arr[k++] = r[j++];
        while (i < left)
            arr[k++] = l[i++];
        while (j < right)
            arr[k++] = r[j++];
    }
}
