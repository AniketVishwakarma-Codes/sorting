import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSortInAscendingOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int x = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    x++;
                }
            }
            if (x == 0)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 23, 76, 98, 89, 45, 44 };
        bubbleSortInAscendingOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
}