public class SelectionSort {

    public static void selectionSortInAscendingOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 23, 76, 98, 89, 45, 44 };
        selectionSortInAscendingOrder(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
