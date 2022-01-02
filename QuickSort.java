public class QuickSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 0, 2, 4, 6, 8};
        qSort(array, 0, array.length - 1);
        for (int element : array)
            System.out.println(element);
    }

    static void qSort(int[] array, int first, int last) {
        if (first < last) {
            int left = first, right = last, middle = array[(left + right) / 2];
            while (left < right) {
                while (array[left] < middle) left++;
                while (array[right] > middle) right--;
                if (left <= right) {
                    int temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
                    left++;
                    right--;
                }
            }
            qSort(array, first, right);
            qSort(array, left, last);
        }
    }
}
