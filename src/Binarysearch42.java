import java.util.Arrays;

public class Binarysearch42 {

    // binary sesrch
    public static int binarysearch(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int  arr[] = {12,34,54,46,56,67,45,46};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarysearch(arr,54));
    }
}

