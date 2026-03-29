public class SecGretest36 {
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 37, 8};
        int max = Math.max(arr[0], arr[1]);
        int secmax = Math.min(arr[0], arr[1]);
        for (int i = 2; i <arr.length ; i++) {
            if (arr[i]> max){
                secmax = max;
                max  = arr[i];
            } else if (arr[i] >secmax) {
                secmax = arr[i];

            }
        }
        System.out.println(secmax);
    }
}
