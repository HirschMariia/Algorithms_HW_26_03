public class Task2 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 2, 15, 14};
        int max = findMax(arr);
        System.out.println("Max element: " + max);
    }

    public static int findMax(int[] arr) {
        return findMaxRecursive(arr, 0, arr[0]);
    }

    public static int findMaxRecursive(int[] arr, int index, int max) {
        if (index == arr.length) {
            return max;
        }

        if (arr[index] > max) {
            max = arr[index];
        }

        return findMaxRecursive(arr, index + 1, max);
    }

}
