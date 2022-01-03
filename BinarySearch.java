public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 8};
        System.out.print(search(arr, 0, arr.length - 1, 8));
    }

    static int search(int[] arr, int l, int r, int x) {
        if (l > r) return -1;
        int mid = (l + r) / 2;
        if (arr[mid] == x) return mid;
        if (arr[mid] > x) return search(arr, l, mid - 1, x);
        return search(arr, mid + 1, r, x);
    }
}
