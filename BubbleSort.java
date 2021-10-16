public class BubbleSort {
    public static void main(String args[]) {
        int arr[] = {0, 2, 4, 6, 8, 1, 3, 5, 7, 9};
        for(int i = arr.length - 1; i > 0; i--)
            for(int j = 0; j < i; j++)
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
        for(int i : arr)
            System.out.println(i);
    }
}
