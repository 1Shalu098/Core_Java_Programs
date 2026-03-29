public class ArraySecondLarg36 {
    public static void main(String[] args) {
        //  second largest value in array
        int arr[] = {10, 5, 2, 37, 8};
        int max = Math.max(arr[0], arr[1]);
        int smax = Math.min(arr[0], arr[1]);
        for (int i = 2; i <arr.length ; i++) {
            if (arr[i]>max) {
                smax = max;
                max = arr[i];

            } else if (arr[i]>smax) {
                smax =arr[i];

            }

        }
        System.out.println(smax);
    }
}
