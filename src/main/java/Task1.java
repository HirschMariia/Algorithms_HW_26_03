public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 44, 50, 60, 86, 114, 140, 145, 190};
        int x1 = 114;
        System.out.println(find(arr1, x1)); // вернёт 6

        int[] arr2 = {1, 24, 30, 46, 60, 100, 120, 133, 270};
        int x2 = 114;
        System.out.println(find(arr2, x2)); // вернёт -1
    }

    public static int find(int[] arr, int x) {
        return binarySearch(arr, x, 0, arr.length - 1);
    }

    public static int binarySearch(int[] arr, int x, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return binarySearch(arr, x, left, mid - 1);
        } else {
            return binarySearch(arr, x, mid + 1, right);
        }
    }

}
